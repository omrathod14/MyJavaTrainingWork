package com.Abstractmodel.test;

import com.Abstractmodel.model.CommericalCustomer;
import com.Abstractmodel.model.Customer;
import com.Abstractmodel.model.ResidentialCustomer;

public class ElectricityBillTest {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];

        customers[0] = new ResidentialCustomer("Rahul", 100);
        customers[1] = new CommericalCustomer("Reliance Mart", 200);
        customers[2] = new ResidentialCustomer("Sneha", 80);

        for (Customer cust : customers) {
            System.out.println(cust.getname() + " - Bill: ₹" + cust.Calculatebill());
        }
    }
}
