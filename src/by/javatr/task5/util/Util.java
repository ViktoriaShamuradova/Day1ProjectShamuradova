package by.javatr.task5.util;

public class Util {
    public static boolean isPerfectNumber(int number) {
        boolean isPerfect = false;
        if (number <= 0) {
            System.out.println(isPerfect);
            return false;
        } else {
            int sumDivider = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumDivider = sumDivider + i;
                }
            }
            if (sumDivider == number) {
                isPerfect = true;
            }
            System.out.println(isPerfect);
            return isPerfect;
        }
    }
}
