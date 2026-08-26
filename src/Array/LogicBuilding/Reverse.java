package Array.LogicBuilding;

public class Reverse {
    public static void reverse(int arr[]){
        int a=0;
        int b=arr.length-1;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        a++;
        b--;
        dispArray(arr);
    }
    public static void dispArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        dispArray(arr);
        System.out.println();
        reverse(arr);
    }
}
