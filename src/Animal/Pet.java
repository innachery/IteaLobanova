package Animal;

public class Pet extends Animal {
    public int eyes = 2;
    public String name;
    public int tail = 1;
    public int paw = 4;

    public Pet() {
        System.out.println("I am pet");

    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }


}
