package enums;

public class Tshirt {

    private TshirtSize size;
    private String manufacturer;

    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public TshirtSize getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
