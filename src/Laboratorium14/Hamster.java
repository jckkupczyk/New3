package Laboratorium14;

public class Hamster extends Animal{

    private static int counter;
    private static String type = "homik";


    public Hamster() {
        counter++;
    }

    @Override
    public int getInstanceNumber() {
        return counter;
    }

    @Override
    public String getType() {
        return type;
    }
}


