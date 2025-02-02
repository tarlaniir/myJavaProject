package school.lesson12;

import java.io.IOException;

public class lesson12 {
    public static void main(String[] args) {

        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };

        AppData appData = new AppData(header, data);
        String filename = "data.csv";


        try {
            CsvSaver.save(appData, filename);
            System.out.println("Данные успешно сохранены в файл " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении данных: " + e.getMessage());
        }


        try {
            AppData loadedData = CsvLoader.load(filename);
            System.out.println("Данные, загруженные из файла " + filename + ":");
            System.out.println(loadedData);
        } catch (IOException e) {
            System.err.println("Ошибка при загрузке данных: " + e.getMessage());
        }
    }
}
