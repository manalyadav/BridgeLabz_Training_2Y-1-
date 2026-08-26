package Array.Leetcode;

import java.util.Arrays;

public class LeetCode_977 {
    public static int[] sqaureOfSortedArray(int[] nums){

        for(int i=0; i< nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    static void main(String[] args) {
        int[] nums={-5,-3,0,4,6};
        System.out.println("Square of Elements: "+Arrays.toString(sqaureOfSortedArray(nums)));
    }
}
