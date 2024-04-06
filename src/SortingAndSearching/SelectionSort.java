package SortingAndSearching;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minidx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            int temp=arr[minidx];
            arr[minidx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void PrintArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr=new int[]{8,1,5,10,7,17};
        selectionSort(arr);
        PrintArray(arr);
    }
}
