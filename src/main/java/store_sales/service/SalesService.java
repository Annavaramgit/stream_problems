package store_sales.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store_sales.dto.StoreSalesInfoDto;
import store_sales.entity.Sales;
import store_sales.entity.Store;
import store_sales.repo.SalesRepo;
import store_sales.repo.StoreRepo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Slf4j
public class SalesService {

    private SalesRepo salesRepo;
    private StoreRepo storeRepo;
    private StoreSalesInfoDto storeSalesInfoDto;

    @Autowired
    public SalesService(SalesRepo salesRepo, StoreRepo storeRepo, StoreSalesInfoDto storeSalesInfoDto) {
        this.salesRepo = salesRepo;
        this.storeRepo = storeRepo;
        this.storeSalesInfoDto = storeSalesInfoDto;
    }

    //for based on store name will find how many products selled and totap price and quantity
    public List<StoreSalesInfoDto> salesInfo(String storeName) {

        Store store = storeRepo.findByName(storeName.toLowerCase().trim());
        if (store != null) {

           // log.info("info :: {}", salesRepo.findAllByStore_StoreId(store.getStoreId()).stream().collect(Collectors.groupingBy(i -> i.getProduct().getProductId(), Collectors.toList())));
            return salesRepo.findAllByStore_StoreId(store.getStoreId()).stream()
                    //grouping same product
                    .collect(Collectors.groupingBy(i -> i.getProduct().getProductId(), Collectors.toList()))
                    .entrySet()
                    .stream()
                    .map(i -> {
                        List<Sales> sales = i.getValue();

                        Sales firstSale = sales.get(0);
                        log.info("firstSale {}",firstSale);
                        int totalQunatity = sales.stream().mapToInt(Sales::getSaleQuantity).sum();
                        double totalAmount = totalQunatity * firstSale.getProduct().getMrp();
                        StoreSalesInfoDto storeSalesInfoDto1 = new StoreSalesInfoDto();


                        storeSalesInfoDto1.setProductName(firstSale.getProduct().getProductName());
                        storeSalesInfoDto1.setMrp(firstSale.getProduct().getMrp());
                        storeSalesInfoDto1.setSaleQuantity(totalQunatity);
                        storeSalesInfoDto1.setAmount(totalAmount);

                        return storeSalesInfoDto1;

                    }).collect(Collectors.toList());


        } else
            return null;
    }

}


