package school.lesson12;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (header != null) {
            sb.append("Header: ");
            for (String h : header) {
                sb.append(h).append(" ");
            }
            sb.append("\n");
        }
        if (data != null) {
            sb.append("Data:\n");
            for (int[] row : data) {
                for (int value : row) {
                    sb.append(value).append(" ");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
