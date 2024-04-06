package Arrays;

public class SecondLargestElement {

    public static int secondLargest(int[] nums){
       int max=Integer.MIN_VALUE;
       int secondMax=Integer.MIN_VALUE;

       for(int i=0;i<nums.length;i++){
           if(nums[i]>max){
               secondMax=max;
               max=nums[i];
           }
           else if(nums[i]>secondMax && nums[i]!=max){
               secondMax=nums[i];
           }
       }
       return secondMax;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{9,3,5,7,15};
        System.out.println(secondLargest(nums));
    }
}
