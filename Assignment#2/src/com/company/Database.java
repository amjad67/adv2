package com.company;


import java.util.HashMap;
import java.util.Map;
public class Database {
    private static Map<Integer, User> users = new HashMap<>();
    private static Map<String, User> usersByName = new HashMap<>();

    public static void addUser(User user) {
        users.put(user.getID(), user);
        usersByName.put(user.getName(), user);
    }

    public static User getUser(int userID) {
        return users.get(userID);
    }

    public static User getUserByName(String name) {
        return usersByName.get(name);
    }
}
