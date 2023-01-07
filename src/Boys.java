//Stwórz klasy Human oraz Boy ustawiając je w odpowiedniej relacji.
// Na przykładzie symbolicznej metody eat() zademonstruj działanie mechanizmu przesłaniania.
public class Boys extends Human {
    void eat() {
        System.out.println("Jestem egzemplarzem klasy: " + this.getClass());
    }
    public static void main(String[] args) {
        Boys boys = new Boys();
        boys.eat();
    }
}

