package com.tocsyk.domain;

public class Leasing extends Contract {

    public Leasing(double paidAmount, double contractRate, double remainingAmount) {
        super(paidAmount, contractRate, remainingAmount);
        this.ContractType = ContractType.Leasing;
        this.Rate = 0.2;
    }
}
