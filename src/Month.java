public class Month {
    public static void serialNumber(int i) {
        switch (i) {
            case 1:
                System.out.println("Січень");
                break;
            case 2:
                System.out.println("Лютий");
                break;
            case 3:
                System.out.println("Березень");
                break;
            case 4:
                System.out.println("Квітень");
                break;
            case 5:
                System.out.println("Травень");
                break;
            case 6:
                System.out.println("Червень");
                break;
            case 7:
                System.out.println("Липень");
                break;
            case 8:
                System.out.println("Серпень");
                break;
            case 9:
                System.out.println("Вересень");
                break;
            case 10:
                System.out.println("Жовтень");
                break;
            case 11:
                System.out.println("Листопад");
                break;
            case 12:
                System.out.println("Грудень");
                break;
            default:
                System.out.println("Рік має лише 12 місяців");
        }

    }

    public static void main(String[] args) {
        serialNumber(75);
    }

}
