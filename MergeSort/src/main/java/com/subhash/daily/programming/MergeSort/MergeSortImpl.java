package com.subhash.daily.programming.MergeSort;

/**
 * Hello world!
 *
 */
public class MergeSortImpl 
{
       
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSortImpl ob = new MergeSortImpl();
        ob.mergeSort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
    
    
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    private void mergeSort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

	private void merge(int[] mainArray,  int leftIndex, int i, int rightIndex) {
		
		
		
	}
}
