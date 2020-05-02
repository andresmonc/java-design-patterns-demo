package FactoryPatternDemo.BankProcessingDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankDealFactoryTest {

    @Test
    void BuildChaseDeal_ExtractCusip_True() {
        String cusip = "123456789";
        BankDeal deal = BankDealFactory.buildChaseDeal(cusip);
        assertEquals("123456789", deal.getCusip());
    }
}