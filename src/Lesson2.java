import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.print("Введіть трьохзначне число: ");
        Scanner inputNum = new Scanner(System.in);
        int i = inputNum.nextInt();
        if (i > 99 && i < 1000) {
            System.out.println("Сума цифр числа: " + sumOfDigits(i));
        } else {
            System.out.println("Ви ввели не трьохзначне число. Спробуйте ще раз");
        }
        sumOfDigits("мама", "папа");
        System.out.println(sumOfDigits(-7.00));
    }

    public static int sumOfDigits(int i) {
        return (i % 10 + (i / 10) % 10 + i / 100);
    }

    public static String sumOfDigits(String word1, String word2) {
        System.out.println(word1 + word2);
        return word1 + word2;
    }

    public static boolean sumOfDigits(double i) {
        if (i > 0) {
            System.out.println("Число більше 0");
            return true;

        } else {
            System.out.println("Число менше 0");
            return false;
        }

    }
}
