package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Bob",LocalDate.of(2019, 2, 12),LocalDate.of(2021, 12, 3)));
        tasks.add(new Task("Johnny",LocalDate.of(2020, 4, 14),LocalDate.of(2022, 3, 2)));
        tasks.add(new Task("Arthur",LocalDate.of(2019, 7, 25),LocalDate.of(2020, 12, 5)));
        tasks.add(new Task("Peter",LocalDate.of(2020, 2, 20),LocalDate.of(2022, 5, 7)));
        tasks.add(new Task("Victoria",LocalDate.of(2020, 4, 18),LocalDate.of(2021, 11, 8)));
        tasks.add(new Task("Francis",LocalDate.of(2020, 8, 13),LocalDate.of(2021, 10, 6)));
        tasks.add(new Task("Angela",LocalDate.of(2021, 2, 20),LocalDate.of(2022, 7, 9)));
        return tasks;
    }
}
