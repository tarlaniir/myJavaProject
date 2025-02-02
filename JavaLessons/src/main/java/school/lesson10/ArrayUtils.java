package school.lesson10;

public class ArrayUtils {

    public static <T> void swap(T[] array, int i, int j) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IllegalArgumentException("Неверно заданы индексы");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
