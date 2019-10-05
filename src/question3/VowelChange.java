package question3;

public class VowelChange {
    public void Vowel(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                arr[i] = '*';
            }
        }
        String st = String.valueOf(arr);
        System.out.println(st);
    }
}
