package question5;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = sc.nextLine();
        System.out.println("Enter a Substring Of The Entered String :-");
        String sub = sc.nextLine();
        System.out.println("Enter A New Substring :-");
        String newSub = sc.nextLine();
        System.out.println(s.replace(sub, newSub));
    }
}



