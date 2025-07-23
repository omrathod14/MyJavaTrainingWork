package com.MethodOverloading;

public class VolumeCalc {
	
	public int volume(int side) {
		return side*side*side;
	}
	
	public int volume(int l,int b,int h) {
		return l*b*h;
	}
	
	public double volume(double rad) {
		return (1.33*3.14*rad*rad*rad);
	}
	
	public static void main(String[] args) {
		VolumeCalc cal=new VolumeCalc();
		
		System.out.println("Volume of cube: "+cal.volume(4));
		System.out.println("Volume of cuboid: "+cal.volume(3, 4, 5));
		System.out.println("Volume of Sphere:"+cal.volume(4));
	}

}
