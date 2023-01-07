public class SubPrinter extends Printer{
    int z = 3;



    void printMe() {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();
    }
}
