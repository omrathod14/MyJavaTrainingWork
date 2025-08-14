package com.MethodOverloading;

public class TravelCost {
	    public void estimate(int distance) {
	        int baseRate = 10;
	        int cost = distance * baseRate;
	        System.out.println("Estimated Travel Cost: Rs" + cost);
	    }

	   
	    public void estimate(int distance, int passengers) {
	        int baseRate = 10;
	        int cost = distance * baseRate;
	        if (passengers > 1) {
	            cost *= passengers;
	        }
	        System.out.println("Estimated Travel Cost (with passengers): ₹" + cost);
	    }

	
	    public void estimate(int distance, int passengers, boolean AC) {
	        int baseRate = 10;
	        int cost = distance * baseRate;

	        if (passengers > 1) {
	            cost *= passengers;
	        }

	        if (AC) {
	            cost += cost * 0.20;  // add 20% for AC
	        }

	        System.out.println("Estimated Travel Cost (with passengers & AC): ₹" + cost);
	    }

	   
	    public static void main(String[] args) {
	        TravelCost travel = new TravelCost();

	       // alone
	        travel.estimate(50);  // ₹500

	        // Distance and passengers
	        travel.estimate(50, 2);  // ₹1000

	        // Distance, passengers, and AC
	        travel.estimate(50, 2, true);  // ₹1200
	    }
	}



