package com.subhash.daily.programming.MergeSort;

import org.apache.log4j.Logger;

public class MergeSortImpl {

	final static Logger logger = Logger.getLogger(MergeSortImpl.class);

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		logger.debug("Program Started");

		MergeSortImpl ob = new MergeSortImpl();
		ob.mergeSort(arr, 0, arr.length - 1);

		logger.debug("\n Sorted array");
		printArray(arr);
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		logger.debug("Array length is :" + n);
		for (int i = 0; i < n; ++i) {

			System.out.print(arr[i] + " ");
		}
	}

	private void mergeSort(int arr[], int leftEnd, int rightEnd) {
		if (leftEnd < rightEnd) {
			int m = (leftEnd + rightEnd) / 2;

			mergeSort(arr, leftEnd, m);
			mergeSort(arr, m + 1, rightEnd);

			merge(arr, leftEnd, m, rightEnd);
		}
	}

	private void merge(int arr[], int leftIndex, int mid, int rightIndex) {
		{
			int n1 = mid - leftIndex + 1;
			int n2 = rightIndex - mid;

			int leftArr[] = new int[n1];
			int rightArr[] = new int[n2];

			for (int i = 0; i < n1; ++i) {
				leftArr[i] = arr[leftIndex + i];
			}
			for (int j = 0; j < n2; ++j) {
				rightArr[j] = arr[mid + 1 + j];
			}

			int i = 0, j = 0;

			int k = leftIndex;
			while (i < n1 && j < n2) {
				if (leftArr[i] <= rightArr[j]) {
					arr[k] = leftArr[i];
					i++;
				} else {
					arr[k] = rightArr[j];
					j++;
				}
				k++;
			}

			while (i < n1) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}

			while (j < n2) {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}

	}
}
