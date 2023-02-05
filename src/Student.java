public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 3) {
            this.name = name;
        } else {
            System.out.println("Імя має бути більше 3 букв");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        } else {
            System.out.println("КУрс студента має бути від 1 до 4");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        } else {
            System.out.println("Бал студента має бути від 1 до 10");
        }
    }

    public Student() {

    }

    public void showInfo() {
        System.out.println("Імя студента " + getName());
        System.out.println("Курс " + getCourse());
        System.out.println("Бал " + getGrade());

    }
}
