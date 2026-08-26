package Array.Leetcode;

import java.util.Arrays;

public class LeetCode_1929 {

    public static int[] concatinationOfArray(int[] nums){
         int[] arr=new  int[nums.length*2];
         for(int i=0; i< nums.length; i++){
             arr[i]=nums[i];
         }
         for (int i=0; i<nums.length; i++){
             arr[nums.length+i]=nums[i];
        }
         return arr;
    }

    static void main(String[] args) {
        int[] ary={1,2,1};
        System.out.println(Arrays.toString(concatinationOfArray(ary)));
    }
}
