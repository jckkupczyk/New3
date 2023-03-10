//Zaprojektuj hierarchię klas tak, aby:
//
//klasa C dziedziczyła po klasie B, a klasa B dziedziczyła po klasie A
//instrukcja new C(); lub new B(); lub new A(); wyświetliła kolejno informacje o wywoływaniu poszczególnych konstruktorów wszystkich klas
//instrukcja new C(true); lub new B(true); lub new A(true); utworzyła konkretny obiekt nie informując o wywołaniu konstruktorów
//instrukcja new C(false); lub new B(false); lub new A(false); utworzyła konkretny obiekt informując tylko o wywołaniu “pierwszego” konstruktora (konstruktory klas bazowych milczą)

package Laboratorium11;

public class A{
    public A() {
        System.out.println("Działa konstruktor A()");
    }

    public A(boolean isSilent) {
        super();
        if (!isSilent) {
            System.out.println("Działa konstruktor A(" + isSilent + ")");
        }
    }
}
