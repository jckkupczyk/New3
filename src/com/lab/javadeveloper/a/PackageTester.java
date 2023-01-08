package com.lab.javadeveloper.a;

public class PackageTester {
    public void introduce() {
        System.out.println("Jestem z pakietu " + this.getClass().getPackageName());
    }
}
