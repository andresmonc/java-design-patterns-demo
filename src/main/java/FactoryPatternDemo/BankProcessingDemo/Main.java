package FactoryPatternDemo.BankProcessingDemo;

public class Main {


    public static void main(String[] args) {
        BankDeal deal = BankDealFactory.buildChaseDeal("12346789|120.40|Security name here");
        System.out.println(deal);
    }

}
