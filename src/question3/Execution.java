package question3;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        VowelChange vw = new VowelChange();
        vw.Vowel(s);

    }
}
