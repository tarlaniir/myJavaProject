package school.lesson12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvSaver {

    public static void save(AppData data, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            String[] header = data.getHeader();
            if (header != null) {
                writer.write(String.join(";", header));
                writer.newLine();
            }


            int[][] table = data.getData();
            if (table != null) {
                for (int[] row : table) {
                    StringBuilder rowStr = new StringBuilder();
                    for (int i = 0; i < row.length; i++) {
                        rowStr.append(row[i]);
                        if (i < row.length - 1) {
                            rowStr.append(";");
                        }
                    }
                    writer.write(rowStr.toString());
                    writer.newLine();
                }
            }
        }
    }
}
