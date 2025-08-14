package com.aurionpro.Enum.Test;

public class TrafficSignalMethod {
	 public String getAction(TrafficSignal signal) {
	        switch (signal) {
	            case RED:
	                return "Stop";
	            case YELLOW:
	                return "Get Ready";
	            case GREEN:
	                return "Go";
	            default:
	                return "Invalid Signal";
	        }
	    }
	
}
