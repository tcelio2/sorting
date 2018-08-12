package br.com.tcelio.sorting;

import java.util.Arrays;

public class QuickSorting {

	public static void main(String[] args) {

		int[] arr = {6,5,3,1,8,7,2,4};
		int low = 0;
		int high = arr.length - 1;
		
		quick(arr, low, high);
	}
	
	static void quick(int[] arr, int low, int high) {
		
		if(arr == null || arr.length ==0) {
			return;
		}
		
		if(low>high) {
			return;
		}
		int i = low;
		int j = high;
		int pivo = arr[low];
		while(i <= j) {
			while(arr[i]<pivo) {
				i++;
			}
			while(arr[j]>pivo) {
				j--;
			}
			if(i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		show(arr);
		
		if(low<j) {
			quick(arr, low, j);
		}
		if(high>i) {
			quick(arr, i, high);
		}
			
	}
	
	static void show(int[] arr) {
		System.out.println("->"+Arrays.toString(arr));
	}

}
