package school.lesson7;

import java.util.Arrays;

public class ArrayMultiplier {
    public static void multiplySmallNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
}
