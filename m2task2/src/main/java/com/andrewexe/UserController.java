package com.andrewexe;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class UserController {

    public static List<User> sortByLastName(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getLastName))
                .collect(Collectors.toList());
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    public static boolean allUsersOlderThan7(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() > 7);
    }

    public static double getAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
    }

    public static int countUniqueCountries(List<User> users) {
        return users.stream()
                .map(User::getCountry)
                .collect(Collectors.toSet())
                .size();
    }
}
