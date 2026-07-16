package Practice_Java;

public class vowelsConso16july {
    public static void main(String args[]) {
        String str = "reena";
        int vowels = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println("Number of vowels :" + vowels);
        System.out.println("Number of Consonants :" +consonant);
    }
}