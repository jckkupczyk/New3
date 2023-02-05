package enums;

public enum TshirtSize {
    S(48, 71, 36),
    M(52, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);

    private int chestWidth;
    private int shirtlength;
    private int sleeveLength;

    TshirtSize(int chestWidth, int shirtlength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtlength = shirtlength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtlength() {
        return shirtlength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }
}
