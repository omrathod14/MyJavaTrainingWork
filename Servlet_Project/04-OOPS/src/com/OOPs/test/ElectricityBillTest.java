package com.OOPs.test;

import com.OOPs.model.ElectricityBill;

public class ElectricityBillTest {
    public static void main(String[] args) {
       
        ElectricityBill.displayCurrentRate();

        
        ElectricityBill apt1 = new ElectricityBill(301, 120);
        ElectricityBill apt2 = new ElectricityBill(302, 85);

        
        apt1.displayBill();
        System.out.println();
        apt2.displayBill();

        // Change rate 
        ElectricityBill.setCostPerUnit(6.0);
        System.out.println("\n--- After rate revision ---");
        ElectricityBill.displayCurrentRate();

        //  bill with new rate
        ElectricityBill apt3 = new ElectricityBill(403, 90);
        System.out.println();
        apt3.displayBill();
    }
}

