package pl.edu.wszib.jwd;

import java.sql.SQLOutput;

public class InstanceCounter {
    private static int numInstances = 0;

    public static int getNumInstances() {
        return numInstances;
    }

    private static void addinstance() {
        numInstances++;
    }

    public InstanceCounter() {
        addinstance();
    }

    public static void main(String[] args) {
        System.out.println("Na początku: " + InstanceCounter.getNumInstances());
        for (int i = 0; i < 1000; i++) {
            if(i % 3 == 0) {
                new InstanceCounter();
            }
        }
        System.out.println("Utworzono: " + InstanceCounter.getNumInstances());
    }

}
