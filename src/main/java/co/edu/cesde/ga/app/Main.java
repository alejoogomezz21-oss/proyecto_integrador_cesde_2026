package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(true, "Alejo", "Gomez", "102030", "P01", 1L);
        Person person2 = new Person(true, "Laura", "Hernandez", "132931", "P02", 2L);

        Student student1 = new Student(true, "Mateo", "Perez", "445566", "S01", 3L, "2005-10-15");
        Student student2 = new Student(true, "Camilo", "Rodriguez", "4234312", "S02", 4L, "2006-03-20");

        Teacher teacher1 = new Teacher(true, "Rodolfo", "Suarez", "6338275", "T01", 5L);
        Teacher teacher2 = new Teacher(true, "Isabel", "Restrepo", "778800", "T02", 6L);



        System.out.println("LISTA DE PERSONAS");
        System.out.println(person1);
        System.out.println(person2);

        System.out.println("\nLISTA DE ESTUDIANTES");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("\nLISTA DE PROFESORES");
        System.out.println(teacher1);
        System.out.println(teacher2);



    }

}