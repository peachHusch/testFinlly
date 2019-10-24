package com.lanou.bean;

public class PeopleBean {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "PeopleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PeopleBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PeopleBean() {
    }
}
