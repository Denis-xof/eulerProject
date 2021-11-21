package euler;

public class Problem6 {

    public static long sumSquareDifference() {
        long sum1 = 0;
        long sum2 = 0;
        for (int sumOfSqare = 0; sumOfSqare <= 100; sumOfSqare++) {
            sum1 += sumOfSqare * sumOfSqare;
            sum2 += sumOfSqare;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        return (sum2*sum2)-sum1;
    }
}
