package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        List<Task> tasks = TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().compareTo(localDate) > 0)
                .collect(Collectors.toList());
        System.out.println(tasks);
    }
}


