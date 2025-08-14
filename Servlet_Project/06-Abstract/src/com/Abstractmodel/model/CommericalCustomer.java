package com.Abstractmodel.model;

public class CommericalCustomer extends Customer {

    public CommericalCustomer(String name, int unitsConsumed) {
        super(name, unitsConsumed);
    }
    
    @Override
    public double Calculatebill() {
        return unitsConsumed * 8; 
    }
}

