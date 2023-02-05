package test3;
import java.util.Calendar;
import java.util.Objects;

// Zaimplementuj klasę Car, przechowującą takie informacje o samochodzie jak
// brand, color, year. Klasa powinna possiadać konstruktor gdzie parametrami
// są wszystkie atrybuty klasy, oraz konstruktor gdzie możemy tylko podać markę
// a domyślnie zostanie przypisany biały kolor oraz  obecny rok produkcji.
// Wyposaż klasę  w metody toString() oraz equals().

public class Car3 {

    private String brand;
    private String color;
    private int year;

    public Car3(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public Car3(String brand) {
        this.brand = brand;
        color = "white";
        year = Calendar.getInstance().get(Calendar.YEAR);
    }

//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car3 car = (Car3) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, year);
    }
}
