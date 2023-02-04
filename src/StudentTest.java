import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Inna", "Ivanova", 3, 4.25, 4.12, 4.5);
        Student student2 = new Student(124, "Anna", "Petrova", 4, 3.95, 4.15, 5.00);
        Student student3 = new Student(236, "Alex", "Antonov", 1, 4.00, 4.88, 4.50);
        System.out.println("Середній бал студента " + student1.name + " " + student1.surname + " " + "складає:" + " " + student1.averageScore());
        System.out.println("Середній бал студента " + student2.name + " " + student2.surname + " " + "складає:" + " " + student2.averageScore());
        System.out.println("Середній бал студента " + student3.name + " " + student3.surname + " " + "складає:" + " " + student3.averageScore());
    }

}




