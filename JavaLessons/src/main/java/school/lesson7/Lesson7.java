package school.lesson7;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {
        System.out.println(SumChecker.isSumInRange(7, 7));
        System.out.println(SumChecker.isSumInRange(2, 1));
        System.out.println(SumChecker.isSumInRange(3, 6));

        NumberSignChecker.checkNumberSign(10);
        NumberSignChecker.checkNumberSign(-5);
        NumberSignChecker.checkNumberSign(0);

        System.out.println(NegativeNumberChecker.isNegative(5));
        System.out.println(NegativeNumberChecker.isNegative(-8));
        System.out.println(NegativeNumberChecker.isNegative(0));

        StringRepeater.repeatString("Привет, мир!", 3);
        System.out.println("---");
        StringRepeater.repeatString("Java — круто!", 5);

        System.out.println(LeapYearChecker.isLeapYear(2024));
        System.out.println(LeapYearChecker.isLeapYear(1900));
        System.out.println(LeapYearChecker.isLeapYear(2000));
        System.out.println(LeapYearChecker.isLeapYear(2023));

        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("До преобразования: " + Arrays.toString(myArray));
        ArrayInverter.invertArray(myArray);
        System.out.println("После преобразования: " + Arrays.toString(myArray));

        int[] myArray2 = new int[100];
        ArrayFiller.fillArray(myArray);
        System.out.println(Arrays.toString(myArray));

        int[] myArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("До обработки: " + Arrays.toString(myArray));
        ArrayMultiplier.multiplySmallNumbers(myArray);
        System.out.println("После обработки: " + Arrays.toString(myArray));

        int size = 5;
        int[][] matrix = new int[size][size];
        MatrixFiller.fillDiagonal(matrix);
        MatrixFiller.printMatrix(matrix);

        int len = 5;
        int initialValue = 7;
        int[] myArray4 = ArrayCreator.createArray(len, initialValue);
        System.out.println(Arrays.toString(myArray));

        int[] myArray1 = {1, 2, 3};
        int n1 = 1;
        System.out.println("Массив до сдвига:");
        ArrayShifter.printArray(myArray1);
        ArrayShifter.shiftArray(myArray1, n1);
        System.out.println("Массив после сдвига:");
        ArrayShifter.printArray(myArray1);
        int[] myArray5 = {3, 5, 6, 1};
        int n2 = -2;
        System.out.println("Массив до сдвига:");
        ArrayShifter.printArray(myArray2);
        ArrayShifter.shiftArray(myArray2, n2);
        System.out.println("Массив после сдвига:");
        ArrayShifter.printArray(myArray2);
    }
}
