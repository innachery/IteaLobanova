public class Lesson7 {
    public static void main(String[] args) {
        int k = 2;
        double[] array = new double[]{6, 13, 15, 18};
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] / k;
                System.out.println(array[i]);
            }
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }

    }
}
