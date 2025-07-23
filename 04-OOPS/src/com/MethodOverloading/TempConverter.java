package com.MethodOverloading;

public class TempConverter {
	public double convert(double celsius) {
		return (celsius * 1.8) + 32;
	}

	public double convert(double value, String scale) {
		if (scale.equalsIgnoreCase("c")) {
			return (value * 1.8) + 32;
		}
		if(scale.equalsIgnoreCase("f")) {
			return (value-32)*0.55;
		}
		
		return 0;

	}
	public static void main(String[] args) {
		TempConverter temp=new TempConverter();
		
		System.out.println(temp.convert(28));
		System.out.println(temp.convert(28, "c"));
		System.out.println(temp.convert(102, "f"));
		
		
	}

}
