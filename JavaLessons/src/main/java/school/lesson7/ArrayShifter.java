package school.lesson7;

public class ArrayShifter {
    public static void shiftArray(int[] array, int n) {
        int len = array.length;
        n = n % len;  // Чтобы сдвиг был корректным даже при большом значении n

        if (n < 0) {
            n += len;  // Преобразуем отрицательное значение n в эквивалентное положительное сдвижение
        }

        for (int i = 0; i < n; i++) {
            int temp = array[len - 1]; // Сохраняем последний элемент
            for (int j = len - 1; j > 0; j--) {
                array[j] = array[j - 1]; // Сдвигаем элементы вправо
            }
            array[0] = temp; // Перемещаем последний элемент на первое место
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
