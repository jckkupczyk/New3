package exceptions;
//wyjątki niekontrolowane
public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumberFromString("9d");
        if (i == -1){
            System.exit(i);
        }
        System.out.println("Oto nasza liczba pomnożona przez 99: " + (i * 99));
    }

    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Coś poszło nie tak, upewnij się, że przekazywany string jest liczbą! " + e.getMessage());

        }
        return -1;
    }
}
