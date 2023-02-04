package Employee2;

import Employee.Employee;
import org.w3c.dom.ls.LSOutput;

public class NewEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee(1250.00, "Ivanov", 125);
        //   System.out.println(employee.salary +employee.surname+employee.id); помилка компіляції, так як параметри salary та id не видимі в іншому пакеті
        employee.showSurname();
        employee.showId();
      //  System.out.println(employee.salary); помилка компіляції
    }
}