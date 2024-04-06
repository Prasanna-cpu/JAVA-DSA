package SortingAndSearching;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=temp;
        }
    }
    public static void PrintArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr=new int[]{8,1,5,10,7,17};
        insertionSort(arr);
        PrintArray(arr);
    }
}
