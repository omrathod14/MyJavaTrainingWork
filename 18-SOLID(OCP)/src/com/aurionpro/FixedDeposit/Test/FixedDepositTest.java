package com.aurionpro.FixedDeposit.Test;

import com.aurionpro.FixedDeposit.model.DiwaliInterest;
import com.aurionpro.FixedDeposit.model.FixedDeposit;
import com.aurionpro.FixedDeposit.model.HoliInterest;

public class FixedDepositTest {
    public static void main(String[] args) {
        FixedDeposit fd1 = new FixedDeposit(101, "Ajay", 1000, 2, new DiwaliInterest());
        System.out.println("Interest for Diwali FD: Rs " + fd1.calculateSimpleInterest());

        FixedDeposit fd2 = new FixedDeposit(102, "Sita", 5000, 3, new HoliInterest());
        System.out.println("Interest for Holi FD: Rs " + fd2.calculateSimpleInterest());
    }
}

