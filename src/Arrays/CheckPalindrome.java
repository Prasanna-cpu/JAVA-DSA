package Arrays;

public class CheckPalindrome {
    public static boolean checker(String str){
        if (str.length()<=1){
            return true;
        }
        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checker("Madam"));
    }
}
