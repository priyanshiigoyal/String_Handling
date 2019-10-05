package question8;

import java.util.Scanner;

public class UpperWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = sc.nextLine();
        int upperweight = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= 65 && a <= 90)
                upperweight = upperweight + a;
        }
        System.out.println("Upper Weight = " + upperweight);
    }
}
