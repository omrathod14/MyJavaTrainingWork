package com.Abstractmodel.model;

public class ResidentialCustomer extends Customer {

    public ResidentialCustomer(String name, int unitsConsumed) {
        super(name, unitsConsumed);
    }
    
    
    @Override
    public double Calculatebill() {
        return unitsConsumed * 5;
    }
}
