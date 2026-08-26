package Array.LogicBuilding;

public class Display {
    public static void dispArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

        dispArray(arr);
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        dispArray(arr);
        System.out.println();
        swap(arr,0,4);
    }
}
