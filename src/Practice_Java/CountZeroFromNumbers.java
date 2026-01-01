package Practice_Java;

public class CountZeroFromNumbers {
    public static void main(String args[]) {
        int n = 1002367022, count = 0;
        while (n > 0) {
            int d = n % 10;
             if (d == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Count how many zeros are present =" + count);
    }
}