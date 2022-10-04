import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(n);
        System.out.println("jfhskjhf");

        Animal cat = new Cat("blue", 21, "cat", "fish");
        Animal dog = new Dog("black", 32, "dog", "govno");

        cat.info();
        dog.info();
    }
}