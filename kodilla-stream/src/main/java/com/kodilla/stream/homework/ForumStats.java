package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOverForty = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .orElseGet(() -> 0.0);
        System.out.println("The average number of Posts for users that are 40 or more is: " + avgOverForty);

        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .orElseGet(() -> 0.0);
        System.out.println("Average number of Posts for younger than 40 users is: " + avg);
    }
}
