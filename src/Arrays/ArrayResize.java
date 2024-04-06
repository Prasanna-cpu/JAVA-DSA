package Arrays;

public class ArrayResize {
    public static void resize(int[] arr,int capacity){
        int[] temp=new int[capacity];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        System.out.println(arr.length);
        System.out.println(temp.length);
    }

    public static void main(String[] args) {
        resize(new int[]{1,2,3,4},8);
    }
}
