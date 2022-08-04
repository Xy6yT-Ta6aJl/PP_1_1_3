package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {


    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Biba", "Lansky", (byte) 33);
        userService.saveUser("Boba", "Lansky", (byte) 30);
        userService.saveUser("Лёлик", "Пупкин", (byte) 53);
        userService.saveUser("Болик", "Пипкин", (byte) 52);

        System.out.println(userService.getAllUsers().toString());

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
