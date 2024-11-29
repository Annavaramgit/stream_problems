package store_sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import store_sales.dto.StoreSalesInfoDto;
import store_sales.service.SalesService;

import java.util.List;

@RestController
public class SalesController {

    private SalesService salesService;

    @Autowired
    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }

    public SalesController() {
        System.out.println("sale ctrl empty const");
    }

    @GetMapping("/getStoreSales")
    public ResponseEntity<List<StoreSalesInfoDto>> storeSalesInfo(@RequestParam String storeName) {

        return new ResponseEntity<>(salesService.salesInfo(storeName), HttpStatus.OK);
    }
}
