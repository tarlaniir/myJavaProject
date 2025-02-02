package school.lesson7;

public class ArrayCreator {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len]; // Создаём массив заданной длины
        for (int i = 0; i < len; i++) {
            array[i] = initialValue; // Заполняем все элементы значением initialValue
        }
        return array; // Возвращаем заполненный массив
    }
}
