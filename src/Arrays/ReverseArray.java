package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] numbers, int start, int end){
        while(start<end){
            int temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{9,1,5,4,8,6};
        int[] res=reverse(nums,0, nums.length-1);
        System.out.println(Arrays.toString(res));

    }
}
