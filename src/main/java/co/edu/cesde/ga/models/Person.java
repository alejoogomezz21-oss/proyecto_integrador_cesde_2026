package co.edu.cesde.ga.models;

public  abstract class Person {

    protected Long  userId;
    protected String code;
    protected String documentNumber;
    protected String firstName;
    protected String lastName;
    protected Boolean status;

    protected Person() {
    }

    protected Person(Boolean status, String firstName, String lastName, String documentNumber, String code, Long userId) {
        this.status = status;
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.code = code;
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return
                "Person{" +
                "userId{" + userId +
                ", code='" + code + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status;
    }
}
