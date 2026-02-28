package co.edu.cesde.ga.models;

public class Student extends Person {
    private String birthDate;

    public Student() {
        super();
    }

    public Student(Boolean status, String firstName, String lastName, String documentNumber, String code, Long userId, String birthDate) {
        super(status, firstName, lastName, documentNumber, code, userId);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public  String toString(){
        return "Student= " + super.toString() +
                "birthDate='" + birthDate + '\'';
    }
}


