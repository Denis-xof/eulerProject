package euler;

public class Problem1 {

    public static long sumMultiples(long number) {
        long sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (isMultiples(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isMultiples(long number) {
        return number % 3 == 0 || number % 5 == 0;
    }
}
