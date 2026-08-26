package Array.Leetcode;

public class LeetCode_387 {
    public static int firstUniqChar(String s) {
        for (int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        String str="leetcode";
        System.out.println(firstUniqChar(str));
    }
}
