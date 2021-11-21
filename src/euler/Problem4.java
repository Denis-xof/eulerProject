package euler;

public class Problem4 {

    public static long LargestPalindromeProduct() {
        long largest = 0;
        for (int firstFactor = 100; firstFactor < 1000; firstFactor++) {
            for (int secondFactor = 100; secondFactor < 1000; secondFactor++) {
                int prod = firstFactor * secondFactor;
                if (prod > largest && isPalindrome(prod)) {
                    largest = prod;
                }
            }
        }
        return largest;
    }

    private static boolean isPalindrome(long number) {
        return String.valueOf(number).equals(new StringBuffer(String.valueOf(number)).reverse().toString());
    }

}
