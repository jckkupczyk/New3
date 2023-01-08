package com.lab.javadeveloper;

public class PackageTesterApp {
    public static void main(String[] args) {
        com.lab.javadeveloper.a.PackageTester pt1 = new com.lab.javadeveloper.a.PackageTester();
        com.lab.javadeveloper.b.PackageTester pt2 = new com.lab.javadeveloper.b.PackageTester();
        com.lab.javadeveloper.c.PackageTester pt3 = new com.lab.javadeveloper.c.PackageTester();

        pt1.introduce();
        pt2.introduce();
        pt3.introduce();
    }
}
