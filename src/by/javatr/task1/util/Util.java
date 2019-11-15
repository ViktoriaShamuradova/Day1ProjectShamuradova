package by.javatr.task1.util;

import by.javatr.task1.exception.LastElementNotIntegerException;

public class Util {

    public static int lastNumberOfNumberSquare(int number) throws LastElementNotIntegerException {
        int last = lastNumber(number);
        int squareOfNumber = square(last);
        String stringSquare = String.valueOf(squareOfNumber);
        char lastNumberChar = stringSquare.charAt(stringSquare.length() - 1);
        String lastNumberString = String.valueOf(lastNumberChar);
        int lastNumberSquare = Integer.parseInt(lastNumberString);

        return lastNumberSquare;
    }

    public static int lastNumberOfNumberSquare(double number) throws LastElementNotIntegerException {
        int last = lastNumber(number);
        int squareOfNumber = square(last);
        String stringSquare = String.valueOf(squareOfNumber);
        char lastNumberChar = stringSquare.charAt(stringSquare.length() - 1);
        String lastNumberString = String.valueOf(lastNumberChar);
        int lastNumberSquare = Integer.parseInt(lastNumberString);

        return lastNumberSquare;
    }

    private static int square(int number) {
        int square = number * number;
        return square;
    }

    public static int lastNumber(double number) throws LastElementNotIntegerException {
        String numberString = String.valueOf(number);
        char lastNumber = numberString.charAt(numberString.length() - 1);
        String lastNumberString = String.valueOf(lastNumber);
        int last;
        try {
            last = Integer.parseInt(lastNumberString);
        } catch (NumberFormatException e) {
            throw new LastElementNotIntegerException();
        }
        return last;
    }

    public static int lastNumber(int number) throws LastElementNotIntegerException {
        String numberString = String.valueOf(number);
        char lastNumber = numberString.charAt(numberString.length() - 1);
        String lastNumberString = String.valueOf(lastNumber);
        int last;
        try {
            last = Integer.parseInt(lastNumberString);
        } catch (NumberFormatException e) {
            throw new LastElementNotIntegerException();
        }
        return last;
    }
}
