package writinghomework;

public class Programme_13_SharedDigit {
    /**
     * Write a programme to input any number and check if it is prime or not.
     * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
     * prime numbers can't be divided by other numbers than itself or 1.
     * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
     */

        public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
            if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
                int firstNumberLastDigit = firstNumber % 10;
                int secondNumberLastDigit = secondNumber % 10;
                firstNumber /= 10;
                secondNumber /= 10;
                int firstNumberFirstDigit = firstNumber;
                int secondNumberFirstDigit = secondNumber;
                return ((firstNumberFirstDigit == secondNumberFirstDigit) ||
                        (firstNumberFirstDigit == secondNumberLastDigit) ||
                        (firstNumberLastDigit == secondNumberFirstDigit) ||
                        (firstNumberLastDigit == secondNumberLastDigit));
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println(hasSharedDigit(12, 23));
            System.out.println(hasSharedDigit(9, 99));
            System.out.println(hasSharedDigit(15, 55));
        }
    }



