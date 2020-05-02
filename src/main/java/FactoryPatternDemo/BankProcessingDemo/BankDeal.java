package FactoryPatternDemo.BankProcessingDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BankDeal {

    private String cusip,tradeId;

    private LocalDate tradeDate;

    private List<Collateral> collaterals = new ArrayList<>();

    public String getCusip() {
        return cusip;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public LocalDate getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(LocalDate tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public List<Collateral> getCollaterals() {
        return collaterals;
    }

    public void setCollaterals(List<Collateral> collaterals) {
        this.collaterals = collaterals;
    }

    @Override
    public String toString() {
        return "BankDeal{" +
                "cusip='" + cusip + '\'' +
                ", tradeId='" + tradeId + '\'' +
                ", tradeDate=" + tradeDate +
                ", collaterals=" + collaterals +
                '}';
    }
}
