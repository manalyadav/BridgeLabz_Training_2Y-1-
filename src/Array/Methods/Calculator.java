package Array.Methods;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }

    static void main(String[] args) {
        System.out.println(add(5,10));
        System.out.println(sub(5,10));
        System.out.println(mul(4,16));
        System.out.println(divide(4,2));
    }
}
