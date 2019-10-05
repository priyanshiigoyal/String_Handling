package question2;

import java.util.Scanner;

public class Substrng {
    public static void substrng(String str, int index) {
        System.out.println(str.substring(index));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        substrng(s, i);
    }
}
