package Animal;

public class Dog extends Pet {
    public String name;

    public Dog(String name) {
        System.out.println("I am dog and my name is " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }

}
