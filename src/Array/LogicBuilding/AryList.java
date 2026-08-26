package Array.LogicBuilding;

import java.util.ArrayList;

public class AryList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,1);
        list.add(2,1);
        list.add(3,1);

        System.out.println("This is our ArrayList: "+list);

        int[] nums= new int[4];
        for(int i=0; i<nums.length; i++){
            nums[i]= list.get(i);
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }
}
