package Employee;

public class OurEmployee {

    public static void main(String[] args) {
        Employee em1 = new Employee(135, "Lobanova");
        Employee em2 = new Employee(2500.00, "Lobanov", 458);
        em2.showId();
        em2.showSurname();
        em1.showId();
        em1.showSurname();
    }
}
