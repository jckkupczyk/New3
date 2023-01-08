package pl.edu.wszib.jwd;

//Stwórz klasy Human oraz Boy ustawiając je w odpowiedniej relacji.
// Na przykładzie symbolicznej metody eat() zademonstruj działanie mechanizmu przesłaniania.
public class Human {

    void eat() {
        System.out.println("Jestem egzemplarzem klasy: " + this.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
    }
}

