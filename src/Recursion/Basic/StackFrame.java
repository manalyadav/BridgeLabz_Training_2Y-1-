package Recursion.Basic;

public class StackFrame {
    public static void m1(){
        int x = 1;
        m2();
        System.out.println(x);
    }

    private static void m2() {
        int x = 2;
        m3();
        System.out.println(x);
    }
    public static void m3(){
        int x = 3;
        System.out.println(x);
    }

    public static void main(String[] args) {
        m1();
    }
}