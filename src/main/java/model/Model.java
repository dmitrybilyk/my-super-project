package model;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by RUSLAN77 on  11.06.2018 in Ukraine
 */
public class Model {
    private static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}