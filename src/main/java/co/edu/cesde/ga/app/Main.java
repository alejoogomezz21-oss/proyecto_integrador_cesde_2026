package co.edu.cesde.ga.app;

import co.edu.cesde.ga.models.Person;
import co.edu.cesde.ga.models.Student;
import co.edu.cesde.ga.models.Teacher;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(true, "Mateo", "Perez", "445566", "S01", "2005-10-15", 3L);
        Student student2 = new Student(true, "Camilo", "Rodriguez", "4234312", "S02", "2006-03-20", 4L);

        Teacher teacher1 = new Teacher(true, "Rodolfo", "Suarez", "6338275", "T01", 5L, 101L);
        Teacher teacher2 = new Teacher(true, "Isabel", "Restrepo", "778800", "T02", 6L, 102L);


        System.out.println("\nLISTA DE ESTUDIANTES");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("\nLISTA DE PROFESORES");
        System.out.println(teacher1);
        System.out.println(teacher2);



    }

}