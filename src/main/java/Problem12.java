public class Problem12 {
    public static void main(String[] args) {
        int triangleNumber = 0, numberOfDivisors = 0;
        for (int i = 1; numberOfDivisors <= 500; i++) {
            triangleNumber = triangleNumber + i;
            numberOfDivisors = 0;
            for (int j = 1; j <= Math.sqrt(triangleNumber); j++) {
                if (triangleNumber % j == 0) {
                    if (triangleNumber%j==j)    //adding only one divisor when they're equal
                        numberOfDivisors += 1;
                    else
                        numberOfDivisors+=2;
                }
            }
        }
        System.out.println(triangleNumber+" is first triangle number with over 500 divisors. It has "+numberOfDivisors+" of them.");
    }
}