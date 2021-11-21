package euler;

public class Problem5 {

    public static long smallestMultiple() {
        for (long num = 20; num < factorial(20); num++) {
            int div = 1;
            int truecount = 0;
            while (num % div == 0 && div < 20) {
                div++;
                truecount++;
                if (truecount == 19) {
                    return num;
                }
            }
        }
        return 0;
    }

    private static long factorial(long number) {
        if (number < 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
