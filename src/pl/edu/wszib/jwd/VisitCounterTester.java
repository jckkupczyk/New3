package pl.edu.wszib.jwd;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();
//        visitCounter.counter++;
//        visitCounter.counter = -13;
//        System.out.println(visitCounter.counter);
        System.out.println(visitCounter.getCounter());
    }
}
