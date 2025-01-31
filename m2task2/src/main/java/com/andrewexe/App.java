package com.andrewexe;

import java.util.List;
import com.andrewexe.User;
import com.andrewexe.UserController;

public class App {
    public static void main(String[] args) {
    	List<User> users = List.of(
                new User(1, "Иван", "Иванов", 20, "Россия"),
                new User(2, "Владимир", "Петров", 19, "Беларусь"),
                new User(3, "Джон", "Сильверхенд", 40, "США"),
                new User(4, "Адам", "Смешер", 35, "США"),
                new User(5, "Кристина", "Степанова", 24, "Россия"),
                new User(6, "Дмитрий", "Удальцов", 28, "Беларусь")
        );
    	System.out.println("Сортировка по фамилиям: " + UserController.sortByLastName(users));
	System.out.println("Средний возраст: " + UserController.getAverageAge(users));


    }
}
