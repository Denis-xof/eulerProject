package euler;

public class Problem7 {
    public static long prime() {
        long num = 1;
        int count=1;
        while (count <= 10001) {
            if (isPrime(num)){
                count++;
                num++;
            }
            num++;
        }
        return num-2;
    }

    private static boolean isPrime(long number) {
        if (number==2){
            return true;
        }
        else {
            for (int div = 2; (long) div * div <= number; div++) {
                if (number % div == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
