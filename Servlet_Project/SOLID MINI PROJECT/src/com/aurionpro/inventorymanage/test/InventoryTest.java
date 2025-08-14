package com.aurionpro.inventorymanage.test;

import java.util.Arrays;

import com.aurionpro.inventorymanage.model.EmailNotifier;
import com.aurionpro.inventorymanage.model.FIFOValuation;
import com.aurionpro.inventorymanage.model.INotifier;
import com.aurionpro.inventorymanage.model.IValuationStrategy;
import com.aurionpro.inventorymanage.model.InventoryService;
import com.aurionpro.inventorymanage.model.Product;
import com.aurionpro.inventorymanage.model.ReorderService;
import com.aurionpro.inventorymanage.model.SMSNotifier;

public class InventoryTest {
    public static void main(String[] args) {
        // Notifiers
        INotifier email = new EmailNotifier();
        INotifier sms = new SMSNotifier();

        // Services
        ReorderService reorderService = new ReorderService();
        IValuationStrategy valuation = new FIFOValuation();

        // Inventory setup
        InventoryService inventory = new InventoryService(
            Arrays.asList(email, sms),
            reorderService,
            valuation
        );

        // Add product
        Product milk = new Product("Milk", 7, 5, 15.0);
        inventory.addProduct(milk);

        // Remove stock
        inventory.removeStock("Milk", 5);

        // Show inventory value
        inventory.showInventoryValue();
    }
}
