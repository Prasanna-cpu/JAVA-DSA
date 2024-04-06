package SortingAndSearching;

import java.util.Arrays;

public class BinarySearching {

    public static int binarySearch(int[] arr,int key){
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                return mid+1;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{8,1,5,10,7,17};
        int pos=binarySearch(arr,8);
        System.out.println(pos);

    }
}
