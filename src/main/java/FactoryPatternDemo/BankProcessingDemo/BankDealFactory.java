package FactoryPatternDemo.BankProcessingDemo;

public class BankDealFactory {

    public static BankDeal buildBonyDeal(String dealLine){
        BankDeal deal = new BankDeal();
        deal.setCusip(dealLine.substring(1,2));
        return deal;
    }

    public static BankDeal buildChaseDeal(String dealLine){
        BankDeal deal = new BankDeal();
        deal.setCusip(dealLine.substring(0,9));
        return deal;
    }


}
