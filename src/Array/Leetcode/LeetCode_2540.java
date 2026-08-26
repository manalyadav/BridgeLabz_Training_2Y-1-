package Array.Leetcode;

import java.util.Arrays;

public class LeetCode_2540 {

    public static int minCommonValue(int[] nums1, int[] nums2){

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr1= {1,8,5,4,2};
        int[] arr2= {6,7,0,3};
        System.out.println("Min Common Value is: "+minCommonValue(arr1,arr2));
    }
}
