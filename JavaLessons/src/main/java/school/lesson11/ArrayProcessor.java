package school.lesson11;

public class ArrayProcessor {


    public static int sum2DArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен иметь 4 строки. Получено: " + arr.length);
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " должна содержать 4 элемента. Получено: " + arr[i].length);
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {

                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: \"" + arr[i][j] + "\"");
                }
            }
        }
        return sum;
    }
}
