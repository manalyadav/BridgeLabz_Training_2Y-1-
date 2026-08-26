package Array.Methods;

public class Palindrome {
    public static boolean isPalindrome(int a){
        int n=a;
        int sum=0;
        while (a>0){
            int rem=a%10;
            sum=sum*10+rem;
            a=a/10;
        }
        if(n==sum){
            return true;
        }
        else {
            return false;
        }
    }

    static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
