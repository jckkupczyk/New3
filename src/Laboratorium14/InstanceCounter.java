package Laboratorium14;

public class InstanceCounter {
    private static int numInstances = 0;

    public static int getInstanceNumber() {
        return numInstances;
    }

    private static void addinstance() {
        numInstances++;
    }

    public InstanceCounter() {
        addinstance();
    }
}
