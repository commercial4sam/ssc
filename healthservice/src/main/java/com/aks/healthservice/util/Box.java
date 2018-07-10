package com.aks.healthservice.util;

public class Box<T> {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		Box<String> box1 = new Box<>();
	}
	
	 public <U extends Number> void inspect(U u){
	        System.out.println("T: " );
	        System.out.println("U: " + u.getClass().getName());
	    }
}
