package com.Transaction.model;

import java.util.Comparator;

public class SortByIdThenAmountComparator implements Comparator<Transaction> {
    public int compare(Transaction t1, Transaction t2) {
        int idCompare = t1.id - t2.id;
        if (idCompare == 0) {
            return Double.compare(t2.amount, t1.amount); // High to low if IDs same
        }
        return idCompare;
    }
}
