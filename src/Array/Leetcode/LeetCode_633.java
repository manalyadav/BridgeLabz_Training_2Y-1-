package Array.Leetcode;


public class LeetCode_633 {
    public static boolean judgeSquareSum(int c) {

        int i = 0;
        long j = (int) Math.sqrt(c);

        while (i <= j) {

            long sum = (long) i * i + (long) j * j;
            if (sum == c) {
                return true;
            }
            else if (sum < c) {
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int c = 2147483600;
        boolean answer = judgeSquareSum(c);

        System.out.println(answer);
    }
}
