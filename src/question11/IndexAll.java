package question11;

import java.util.Scanner;

public class IndexAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = sc.nextLine().toLowerCase();
        System.out.println("Enter A Character :- ");
        char a = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("Indexes Of Given Character :- ");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a)
                System.out.println(i);
        }
    }
}

