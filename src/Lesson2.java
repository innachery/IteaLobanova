import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("Сума цифр трьохзначного числа складає " + actionsWithNumbers(117));
        System.out.println("Сума довжин двох слів складає: " + actionsWithNumbers("привіт", "папа"));
        System.out.print("Введіть число: ");
        Scanner inputNum = new Scanner(System.in);
        double i = inputNum.nextDouble();
        System.out.println(actionsWithNumbers(i));
    }

    public static int actionsWithNumbers(int i) {
        return (i % 10 + (i / 10) % 10 + i / 100);
    }

    public static int actionsWithNumbers(String word1, String word2) {
        return word1.length() + word2.length();
    }

    public static boolean actionsWithNumbers(double i) {
        if (i > 0) {
            System.out.println("Число більше 0");
            return true;

        } else {
            System.out.println("Число менше 0");
            return false;
        }

    }
}
