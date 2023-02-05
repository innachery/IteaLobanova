package Animal;

public class Animal {
    private static int eyes;

    public static int getEyes() {
        return eyes;
    }

    public static void setEyes(int eyes) {
        Animal.eyes = eyes;
    }

    public Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}
