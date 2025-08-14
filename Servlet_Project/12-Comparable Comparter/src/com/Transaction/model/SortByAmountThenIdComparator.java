package com.Transaction.model;

import java.util.Comparator;

public class SortByAmountThenIdComparator implements Comparator<Transaction> {
    public int compare(Transaction t1, Transaction t2) {
        int amountCompare = Double.compare(t2.amount, t1.amount); // High to low
        if (amountCompare == 0) {
            return t1.id - t2.id; // Ascending ID
        }
        return amountCompare;
    }
}

