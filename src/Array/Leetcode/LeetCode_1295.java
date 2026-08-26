package Array.Leetcode;

public class LeetCode_1295 {
    public static int evenNumberDigits(int[] nums){
        int count=0;
        for(int i=0; i<nums.length; i++){
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || (nums[i]==100000)){
                count++;
            }
        }
        return count;
    }

    static void main(String[] args) {
        int[] arr={44,5,888,99999,100000,6987};
        System.out.println("Even Digits of Elements are: "+evenNumberDigits(arr));
    }
}
