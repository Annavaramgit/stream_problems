package streams.practice.series1.emi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        List<Bank> banks = new ArrayList<>();
        banks.add(new Bank("hdfc",6.5));
        banks.add(new Bank("sbi",5.5));
        banks.add(new Bank("union",4.5));

        Scanner sc =new Scanner(System.in);
        System.out.println("hdfc ,union,sbi are available please select any bank with name");
        String bankName = sc.nextLine();
        System.out.println("enter how many years you want");
        int years = sc.nextInt();
        System.out.println("enter how much money you want");
        double amount = sc.nextDouble();

        //this is shows emi for client selected bank

        Bank bank = banks.stream().filter(i -> i.getBankName().equalsIgnoreCase(bankName))
                .findFirst().orElse(null);

        if(bank!=null){
          double monthlyEmi  = emiCalculate(years,bank.getRateOfInterest(),amount) ;
            System.out.println("Bank: "+bank.getBankName()+"  Emi: "+monthlyEmi);
        }
        else{
            System.out.println("invalid bank..");
        }




        //this is shows at a time emi for all banks+
     /*
        banks.stream().
                forEach(bank1->
                {
                    double emi = emiCalculate(years,bank1.getRateOfInterest(),amount);
                    System.out.println("Bank: "+bank1.getBankName()+" Emi: "+ emi);
                });

      */

}
    public static double emiCalculate(int years,double rateOfInterest,double amount){
        int months = years*12;
        double monthlyRateOfInterest = rateOfInterest/(12*100);

        return (amount*monthlyRateOfInterest*Math.pow(1+monthlyRateOfInterest,months))/(Math.pow(1+monthlyRateOfInterest,months)-1);


}
}
