package com.kodilla.optional.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Martin Til", new Teacher("Donald Wal")));
        students.add(new Student("Ori Ozbon", new Teacher("Fil Mores")));
        students.add(new Student("Olaf Zen", null));
        students.add(new Student("Tom Azar", new Teacher("Alfred Prom")));
        students.add(new Student("Ivan Ogr", null));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Name of student: " + student.getName() + " and his teacher is: " + optionalTeacher.orElse(new Teacher("<undefined>")).getName());
        }
    }
}




