package Laboratorium14;

public class Cat extends Animal{
    private static int counter;
    private static String type = "kot";


    public Cat() {
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

