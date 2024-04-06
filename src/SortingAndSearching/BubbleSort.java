package SortingAndSearching;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void PrintArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr=new int[]{8,1,5,10,7,17};
        bubbleSort(arr);
        PrintArray(arr);
    }
}
