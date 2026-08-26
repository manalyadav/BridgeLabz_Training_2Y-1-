package Array.LogicBuilding;

public class PairSum {
    public static int pairCount(int[] arr, int target){
        int pairCount=0;
        for(int i=0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    pairCount++;
                }
            }
        }
        return pairCount;
    }
    public static int tripleCount(int[] arr, int target){
        int tripleCount=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for (int k=j+1; k< arr.length; k++) {
                    if (arr[i] + arr[j] +  arr[k] == target) {
                        tripleCount++;
                    }
                }
            }
        }
        return tripleCount;
    }

    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(pairCount(arr,9));
        System.out.println(tripleCount(arr,9));
    }
}
