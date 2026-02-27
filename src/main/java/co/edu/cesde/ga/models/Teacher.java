package co.edu.cesde.ga.models;

public class Teacher extends Person {
    private String code;

    public Teacher() {
        super();
    }

    public Teacher(Boolean status, String firstName, String lastName, String documentNumber, String code, Long userId) {
        super(status, firstName, lastName, documentNumber, code, userId);
        this.code = code;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
}