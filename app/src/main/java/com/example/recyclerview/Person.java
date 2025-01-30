package com.example.recyclerview;

public class Person {
    String name;
    int age;
    int imageId;

    public Person(int age, int imageId, String name) {
        this.age = age;
        this.imageId = imageId;
        this.name = name;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
