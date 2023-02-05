package lab;
//
// Zmodyfikuj klasę PrimeFinder w taki sposób, aby zgłaszała nowy wyjątek NegativeNumberException,
// jeśli do konstruktora zostanie przekazana wartość ujemna.

// Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek.
// Do obliczenia pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt().
// Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException.
// Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.

import exceptions.AgeRangeException;

public class PrimeFinder implements Runnable {
    public long target;
    public long prime;
    public boolean finished = false;
    private Thread runner;

    PrimeFinder(long inTarget) //throws NegativeNumberException {
    {
//        if(inTarget < 0) {
//            throw NegativeNumberException("Podano liczbę ujemną");
//        }
        target = inTarget;
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void run() {
        long numPrimes = 0;
        long candidate = 2;
        while (numPrimes < target) {
            if (isPrime(candidate)) {
                numPrimes++;
                prime = candidate;
            }
            candidate++;
        }
        finished = true;
    }

    boolean isPrime(long checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0)
                return false;
        }
        return true;
    }
}