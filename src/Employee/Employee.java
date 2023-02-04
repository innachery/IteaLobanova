package Employee;

public class Employee {
    private double salary;
    public String surname;
    protected int id;

    //   public void showSalary(){ помилка компіляції, так як аргумент методу має модифікатор private
    //       System.out.printf(salary);
    //   }
    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    private  Employee(double salary, String surname) {
        this.salary = salary;
        this.surname = surname;
    }

     Employee(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }

}
