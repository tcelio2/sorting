package br.com.tcelio.sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {

		int[] arr = {6,5,3,1,8,7,2,4};		
		buble(arr);

	}

	static void buble(int[] lista) {
		boolean verify = true;
		while(verify) {
			verify = false;
			for (int i = 0; i < lista.length-1; i++) {

				if(lista[i] > lista[i+1]) {
					verify = true;
					int temp = lista[i];
					lista[i] = lista[i+1];
					lista[i+1] = temp;
				}				
			}
		}
		show(lista);
	}

	static void show(int[] lista) {
		System.out.println("-->"+Arrays.toString(lista));
	}
}
