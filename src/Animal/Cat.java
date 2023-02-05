package Animal;

public class Cat extends Pet {
    public String name;

    public Cat(String name) {
        System.out.println("I am cat and my name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
