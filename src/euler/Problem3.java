package euler;

public class Problem3 {

    public static long primeFactor(long number) {
        long div = 2;
        while (number > 1) {
            while (number % div == 0) {
                number /= div;
            }
            div++;
        }
        return --div;
    }

}
