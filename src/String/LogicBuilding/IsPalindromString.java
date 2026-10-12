package String.LogicBuilding;

import java.util.Scanner;

public class IsPalindromString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();

        String result=new StringBuilder(str).reverse().toString();

        if (result.equals(str)){
            System.out.println(str+" is a palindrom");
        }
        else{
            System.out.println(str+" is not a palindrom");
        }
    }
}
