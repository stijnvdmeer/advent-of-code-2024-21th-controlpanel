public class Button {
    private String value;
    private int colPos;
    private int rowPos;

    public Button(String value, int colPos, int rowPos) {
        this.value = value;
        this.colPos = colPos;
        this.rowPos = rowPos;
    }

    public String getValue() {
        return value;
    }

    public int getColPos() {
        return colPos;
    }

    public int getRowPos() {
        return rowPos;
    }
}
