package co.edu.cesde.ga.models;

public class Teacher extends Person {
    private Long teacherId;
    public Teacher() {

        super();
    }

    public Teacher(Boolean status, String firstName, String lastName, String documentNumber, String code, Long userId, Long teacherId) {
        super(status, firstName, lastName, documentNumber, code, userId);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", " + super.toString() +
                '}';
    }
}