package school.lesson11;

public class lesson11 {
    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "семь", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        System.out.println("=== Тестирование корректного массива ===");
        try {
            int sum = ArrayProcessor.sum2DArray(correctArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Тестирование массива с неверными данными ===");
        try {
            int sum = ArrayProcessor.sum2DArray(wrongDataArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Тестирование массива неверного размера ===");
        try {
            int sum = ArrayProcessor.sum2DArray(wrongSizeArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
