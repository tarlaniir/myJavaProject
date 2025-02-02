package school.lesson7;

public class NumberSignChecker {
    public static void checkNumberSign(int number) {
        if (number >= 0) {
            System.out.println(number + " — положительное число.");
        } else {
            System.out.println(number + " — отрицательное число.");
        }
    }
}
