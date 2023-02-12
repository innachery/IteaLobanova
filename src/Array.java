public class Array {
    public static void main(String[] args) {
        int[] array = {5, 11, 7, 20};
        int j = 0;
        int min = Math.abs(array[1] - array[0]);
        for (int i = 1; i < array.length; i++) {
            j = Math.abs(array[i] - array[i - 1]);
            if (j <= min) {
                min = j;
            }
        }
        System.out.println("Minimum value " + min);
    }
}


