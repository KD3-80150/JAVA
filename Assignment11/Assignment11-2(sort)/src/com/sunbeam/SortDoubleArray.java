package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;

public class SortDoubleArray {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		class DoubleComparator implements Comparator<Double> {
			@Override
			public int compare(Double a, Double b) {
				return a.compareTo(b);
			}

		}

		Double[] arr1 = { 1.5, 5.6, 4.2, 8.1, 1.0, 9.2, 6.84, 9.82 };
		selectionSort(arr1, new DoubleComparator());

		for (Double ele : arr1) 
		{
		System.out.println(ele);	
		}
	}
}
