package Array.Leetcode;

import java.util.Arrays;

public class LeetCode_1365 {
    public static int[] smallerThanCurrentElement(int[] nums){
        int[] result=new int[nums.length];
        for(int i=0; i< nums.length; i++){
            for(int j=0; j< nums.length; j++){
                if(nums[j]<nums[i]){
                    result[i]++;
                }
            }
        }
        return result;
    }

    static void main(String[] args) {
        int[] arr={8,1,2,7,4,3};
        System.out.println("Your Array is ready: "+ Arrays.toString(smallerThanCurrentElement(arr)));
    }
}
