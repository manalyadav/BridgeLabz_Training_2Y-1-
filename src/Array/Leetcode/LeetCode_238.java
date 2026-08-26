package Array.Leetcode;

import java.util.*;

public class LeetCode_238 {
    public static int[] productExceptSelf(int[] nums) {

        int n= nums.length;
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=1;
        for (int i=1; i<nums.length; i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for(int i=nums.length-2; i>-1; i--){
            right[i]=right[i+1]*nums[i+1];
        }
        int[] answer=new int[n];
        for(int i=0; i<nums.length; i++){
            answer[i]=left[i]*right[i];
        }
        return answer;

    }

    static void main(String[] args) {
        int[] arr={8,5,4,2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}