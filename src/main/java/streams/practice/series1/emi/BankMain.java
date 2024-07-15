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


      Bank foundBank =   banks.stream().filter(i->i.getBankName().equalsIgnoreCase(bankName))
                .findFirst()
                .orElse(null);

      if(foundBank!=null){
          double emiResult = emiCalculate(years, foundBank.getRateOfInterest(),amount);
          System.out.println("bank name:"+foundBank.getBankName()+" Monthly Emi"+ emiResult);
      }
    }



    public static double emiCalculate(int duration,double rateOfInterest,double principleAmount){
        int months = duration*12;
        double monthlyInterest = rateOfInterest/(12*100);
        return (principleAmount*monthlyInterest*Math.pow(1+monthlyInterest,months))/
                (Math.pow(1+monthlyInterest,months)-1);

    }

}
