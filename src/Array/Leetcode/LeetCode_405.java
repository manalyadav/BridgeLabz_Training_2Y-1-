package Array.Leetcode;

public class LeetCode_405 {
    public static String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        char[] hexMap = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        while (num != 0) {

            int last4Bits = num & 15;
            result.append(hexMap[last4Bits]);

            num >>>= 4;
        }

        return result.reverse().toString();
    }

    static void main(String[] args) {
        System.out.println(toHex(55));
    }
}
