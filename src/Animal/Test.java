package Animal;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka");
        cat.sleep();
        Dog dog = new Dog("Rex");
        System.out.println("Собака має " + dog.paw + " лапи ");
    }
}
