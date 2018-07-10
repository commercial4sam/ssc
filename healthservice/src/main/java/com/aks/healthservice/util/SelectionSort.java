package com.aks.healthservice.util;

public class SelectionSort {

	public static void main(String[] args) {

		   int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};
		   int largest=numbers[0];
		   int smallest=numbers[0];
		   for(int i=0;i<numbers.length-1;i++){
			   if(numbers[i] > largest)
				   largest=numbers[i];
			   else if(numbers[i]<smallest)
				   smallest=numbers[i];
		   }
		   
		   System.out.println("Largest and smallest "+largest+"  "+smallest);
	}

}
