package br.com.tcelio.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {6,5,3,1,8,7,2,4};
		select(arr);
	}
	private static void select(int[] arr) {
		int i = 0;
		int j = 0;
		int menor = 0;
		while(i <= arr.length -1) {
			while(j <= arr.length -1) {
				if(arr[j] < arr[menor]) {
					menor = j;
				}
				j++;
			}
			int temp = arr[i];
			arr[i] = arr[menor];
			arr[menor] = temp;
			i++;
			menor = i;
			j = i;
		}	
		show(arr);
	}

	private static void show(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
