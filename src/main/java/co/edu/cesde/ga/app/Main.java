package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello word");
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        person2.setFirstName("Laura");
        person2.getFirstName();

        person3.setFirstName("Mateo");
        person3.getFirstName();

        person4.setFirstName("juan");
        person4.getFirstName();

        Person person1 = new Person(true, "Alejo", "Gomez", "1036930029", "123", 1L);


        Student student1 = new Student();

        Student student2 = new Student();
        student2.setFirstName("Alejito");

        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Rodolfo");



    }

}