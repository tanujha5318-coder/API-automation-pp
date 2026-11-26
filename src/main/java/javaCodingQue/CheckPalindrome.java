package javaCodingQue;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String rev = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            rev = rev+input.charAt(i);
        }
        //System.out.print(rev);
        if (input.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
