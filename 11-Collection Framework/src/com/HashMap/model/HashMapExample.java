package com.HashMap.model;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
	    map.put(1, "Om");
	    map.put(2, "Srushti");
	    map.put(3, "Aradhya");
	    map.put(4, "Rushabh");
	    
	    map.putIfAbsent(5, "Vivek");
	    
	    //System.out.println(map.get(2));
//	    
//	    System.out.println(map.remove(5));
//	    
//	    System.out.println(map.remove(4,"Rushabh"));
//	    
	    System.out.println(map.containsKey(2));
	    
	    System.out.println(map.size());
	    
	    System.out.println(map.isEmpty());
	    
	    System.out.println(map.keySet());
	    
	    System.out.println(map.values());
	    
	    System.out.println(map.replace(3, "Vaishnavi"));
	    
	    System.out.println(map);
	}

}
