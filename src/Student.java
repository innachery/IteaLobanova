public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathScore;
    double economicsScore;
    double foreignLanguageScore;

    public Student(int studentId, String name, String surname, int course, double mathScore, double economicsScore, double foreignLanguageScore) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.mathScore = mathScore;
        this.economicsScore = economicsScore;
        this.foreignLanguageScore = foreignLanguageScore;
    }

    public Student(double mathScore, double economicsScore, double foreignLanguageScore) {
        this.mathScore = mathScore;
        this.economicsScore = economicsScore;
        this.foreignLanguageScore = foreignLanguageScore;
    }

    double averageScore() {
        return ((mathScore + economicsScore + foreignLanguageScore) / 3);
    }

}


