package co.edu.cesde.ga.models;

public class Student extends Person {
    private Long studentId;
    private String birthDate;

    public Student() {
        super();
    }

    public Student(Boolean status, String firstName, String lastName, String documentNumber, String code, String birthDate, Long studentId) {
        super(status, firstName, lastName, documentNumber, code, studentId);

        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", birthDate='" + birthDate + '\'' +
                ", " + super.toString() +
                '}';
    }
}


