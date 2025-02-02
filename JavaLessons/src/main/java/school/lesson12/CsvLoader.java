package school.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvLoader {
    public static AppData load(String filename) throws IOException {
        String[] header = null;
        ArrayList<int[]> dataRows = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean isFirstLine = true;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                if (isFirstLine) {
                    header = line.split(";");
                    isFirstLine = false;
                } else {

                    String[] tokens = line.split(";");
                    int[] row = new int[tokens.length];
                    for (int i = 0; i < tokens.length; i++) {
                        row[i] = Integer.parseInt(tokens[i].trim());
                    }
                    dataRows.add(row);
                }
            }
        }


        int[][] data = new int[dataRows.size()][];
        for (int i = 0; i < dataRows.size(); i++) {
            data[i] = dataRows.get(i);
        }

        return new AppData(header, data);
    }
}
