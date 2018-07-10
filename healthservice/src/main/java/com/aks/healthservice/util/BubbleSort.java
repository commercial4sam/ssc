package com.aks.healthservice.util;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[]={11,6,8,5,2,1,9,10,13};
		int temp;
		for(int i=arr.length-1;i>0;i--){
			System.out.println("Outer Loop :"+i);
			
			for(int j=1;j<=arr.length-1;j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int s:arr){
			System.out.print(s+" ");
		}
	
	}

}
