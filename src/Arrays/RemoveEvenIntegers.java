package Arrays;

import java.util.Arrays;

public class RemoveEvenIntegers {
    public static int[] RemoveEven(int[] arr){
        int odd=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] % 2 != 0) {
                odd+=1;
            }
        }

        int[] result=new int[odd];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 6, 9, 15};

        int[] res=RemoveEven(arr);

        System.out.println(Arrays.toString(res));

    }
}
