package ua.edu.ucu.apps.demo.flower_store;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF"),
    BLACK("000000"), WHITE("FFFFFF"), YELLOW("FFFF00");
    private final String stringRepresentation;
    FlowerColor(String stringrepresentation) {
        this.stringRepresentation = stringrepresentation;
    }
}
