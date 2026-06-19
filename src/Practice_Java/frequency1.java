package Practice_Java;

public class frequency1 {
    public static void main(String args[]) {
        String str = "aabbccd";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                        alreadyPrinted = true;
                        break;
                }
            }
            if (alreadyPrinted == false) {

                System.out.println(str.charAt(i) + "=" + count);
            }

        }
    }
}