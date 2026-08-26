package Array.Leetcode;

public class LeetCode_2427 {
    public static int commonFactors(int a, int b) {
        int count=0;
        int limit=Math.min(a,b);
        for(int i=1; i<=limit; i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }

    static void main(String[] args) {
        System.out.println(commonFactors(4,12));
    }
}
