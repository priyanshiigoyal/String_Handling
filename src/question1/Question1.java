package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner((System.in));
        str = sc.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nchars:\t");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "\t");
        }

    }
}
