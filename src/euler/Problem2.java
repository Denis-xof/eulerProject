package euler;

public class Problem2 {
    public static long sum(long number) {
        long sum = 0;
        for (int i = 0; fibonacci(i) < number; i++) {
            if (isEven(fibonacci(i))) {
                sum += fibonacci(i);
            }
        }
        return sum;
    }

    private static boolean isEven(long number) {
        return number % 2 == 0;
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

