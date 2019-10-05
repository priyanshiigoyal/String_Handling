package question10;

import java.util.Scanner;

public class IndexChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = sc.nextLine();
        System.out.println("Enter A Character :-");
        char a = sc.nextLine().charAt(0);
        System.out.println("Index Of Given Character = " + s.indexOf(a));
    }
}
