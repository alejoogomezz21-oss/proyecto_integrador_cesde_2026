package co.edu.cesde.ga.models;

public class Teacher extends Person {

    private String birthDate;

    public Teacher() {
        super();
    }

    public Teacher(Boolean status, String firstName, String lastName, String documentNumber, String code, Long userId) {
        super(status, firstName, lastName, documentNumber, code, userId);
    }

    @Override
    public  String toString(){
        return "Teacher= " + super.toString() + '\'';
    }
}