package com.aurionpro.Enum.Test;

public class TrafficAction {
 public static void main(String[] args) {
     TrafficSignalMethod model = new TrafficSignalMethod();

     for (TrafficSignal signal : TrafficSignal.values()) {
         String action = model.getAction(signal);
         System.out.println(signal + " → " + action);
     }
 }
}
