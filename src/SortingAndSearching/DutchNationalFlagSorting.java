package SortingAndSearching;

import java.util.Arrays;

public class DutchNationalFlagSorting {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void DNFSort(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }


        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{0,1,0,0,2,0,1,1,2,2,0,0,2,0};
        DNFSort(arr);
        printArray(arr);
    }


}
