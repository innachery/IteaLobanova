import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
    private String name;
    private String color;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fruit(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("Apple", "red", 10.50);
        Fruit fruit2 = new Fruit("Pear", "green", 12.30);
        Fruit fruit3 = new Fruit("Lemon", "yellow", 9.00);
        List<Fruit> fruits = List.of(fruit1, fruit2, fruit3);
        System.out.println(fruits);
        List<Fruit> greenFruits = fruits.stream().filter(fruit -> fruit.getColor().equals("green")).collect(Collectors.toList());
        System.out.println(greenFruits);
        List<Fruit> priceOfFruits = fruits.stream().filter(fruit -> fruit.getPrice() > 10).collect(Collectors.toList());
        System.out.println(priceOfFruits);
    }
}
