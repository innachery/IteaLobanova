public class Patterns {
    public static void pattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }
        for (int i = 5 - 1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }

    }

    public static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }

    }

    public static void pattern3() {
        for (int i = 1; i <= 5; i++) {
            for (int k = i; k <= 5; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }

    }

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
    }
}