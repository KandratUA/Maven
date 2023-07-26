package org.example;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        String name = "Dmytro";
        String lastName = "Kondratynsky";

        Person person = new Person(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}

class Person {
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}