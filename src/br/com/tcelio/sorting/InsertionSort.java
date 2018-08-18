package br.com.tcelio.sorting;

import java.util.Arrays;

public class InsertionSort {
	static int[] arr = {6,5,3,1,8,7,2,4};

	public static void main(String[] args) {
		insertSort(arr);
	}
	private static void insertSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int m = i;
			while(m >= 0) {
				if( m > 0 && (arr[m] < arr[m-1])) {
					change(m,m-1);					
				}
				m--;
			}
			
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void change(int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp; 
	}
}