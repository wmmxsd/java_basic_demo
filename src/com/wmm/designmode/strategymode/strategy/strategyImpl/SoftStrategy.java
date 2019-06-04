package com.wmm.designmode.strategymode.strategy.strategyImpl;

import com.wmm.designmode.strategymode.strategy.Strategy;

public class SoftStrategy implements Strategy {
    @Override
    public void delete() {
        System.out.println("softStrategy delete");
    }
}
