package Arrays;

import java.util.Arrays;

public class MissingNumber {

    public static int Missing(int[] arr){
        int n=arr.length;
        int AssumedSum=n*(n+1)/2;
        int sum= Arrays.stream(arr).sum();
        int missingNumber=Math.abs(AssumedSum-sum);
        return missingNumber;

    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,6,7,8,9,10};
        System.out.println(Missing(arr));
    }
}
