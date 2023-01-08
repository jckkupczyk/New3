package pl.edu.wszib.jwd;

import java.awt.Color; //import java.awt.*; wtedy java importuje wszyskie klasy.

public class PackageColorTester {
    public static void main(String[] args) {

        java.lang.System.out.println("Dzień dobry"); //odwołanie przez nazwę kwalifikowaną
        java.awt.Point point = new java.awt.Point();
        Color color = new Color(255,0,0);
    }
}
