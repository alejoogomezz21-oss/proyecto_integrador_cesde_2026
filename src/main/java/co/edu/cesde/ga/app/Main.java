package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Student(true, "Carlos", "Perez", "1010", "S-01", 1L));
        people.add(new Teacher(true, "Marta", "Ruiz", "2020", "T-01", 2L));

        for (Person p : people) {
            System.out.println("Registrado: " + p.getFirstName() + " " + p.getLastName());
        }
    }
}