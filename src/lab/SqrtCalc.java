package lab;

import java.util.Scanner;

public class SqrtCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = 0;
        System.out.print("Podaj liczbę: ");

        try {
            d = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Błąd! Podana wartość nie jest liczbą.");
            System.exit(-1);
        } finally {
            System.out.println("Koniec");
        }

        if(d < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(Math.sqrt(d));
    }
}
