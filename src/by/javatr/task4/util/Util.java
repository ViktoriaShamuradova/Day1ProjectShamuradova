package by.javatr.task4.util;

public class Util {
    public static boolean isTwoOrMoreEvenNumbers(double... numbers) {
        int count = 0;
        boolean is = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
            if (count >= 2) {
                is = true;
                return is;
            }
        }
        System.out.println(is);
        return is;
    }
}
