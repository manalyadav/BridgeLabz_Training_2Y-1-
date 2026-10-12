package Array.LogicBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        int j=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]!=0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
