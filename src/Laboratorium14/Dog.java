package Laboratorium14;

public class Dog extends Animal {

    private static int counter;
    private static String type = "pies";


    public Dog() {
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
