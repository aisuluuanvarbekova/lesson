package com.company;

public final class Daughter {
    private int age;
    private String name;
    private String[] hobby;
    private Nationality nationality;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String[] getHobby() {
        return hobby;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public Daughter(int age, String name, String[] hobby, Nationality nationality) {
        this.age = age;
        this.name = name;
        this.hobby = hobby;
        this.nationality = nationality;
    }
}
