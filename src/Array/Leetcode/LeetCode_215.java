package Array.Leetcode;

import java.util.*;

public class LeetCode_215 {
    public static int kthLargestElement(int[] nums, int k){

        Arrays.sort(nums);
        return nums.length-k;

    }

    static void main(String[] args) {
        int[] arr={5,1,2,6,3,4,6,5};
        int k=2;

        System.out.println("kth Largest Element in an Array is: "+kthLargestElement(arr,k));
    }
}
