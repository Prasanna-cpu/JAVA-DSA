package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static int[] moveZeros(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }


        return arr;
    }

    public static void main(String[] args) {
        int[] arr =new int[]{2,3,0,7,8,0,10,17,0,38,9,0,5,4};
        int[] res=moveZeros(arr);
        System.out.println(Arrays.toString(res));
    }
}
