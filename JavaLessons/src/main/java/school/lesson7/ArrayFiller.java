package school.lesson7;

import java.util.Arrays;

public class ArrayFiller {
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Заполняем массив числами от 1 до 100
        }
    }
}
