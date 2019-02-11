package com.example.jack.testarinfo.model;

public class Model {
    private String name;
    private String salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Model(String name, String salary) {
        this.name = name;
        this.salary = salary;
    }
}
