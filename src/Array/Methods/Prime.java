package Array.Methods;

public class Prime {
    public static boolean isPrime(int a){
        int count=0;
        for (int i=1; i<=a; i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        else
            return false;
    }

    static void main(String[] args) {
        System.out.println(isPrime(2));
    }
}
