package Practice_Java;

public class countNegPosZeroValues {
    public static void main(String args[]) {

        int arr[] = {1, -1, 5, -3, 0, 0};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive count = " + positive);
        System.out.println("Negative count = " + negative);
        System.out.println("Zero count = " + zero);
    }
}