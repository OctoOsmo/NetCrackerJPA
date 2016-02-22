package org.my.persistence.entities;

/**
 * Created by al on 21.02.2016.
 */


public class TrainDriver {

    private String name;
    private Integer age;
    private float salary;

    public TrainDriver() {
    }

    public TrainDriver(String name, Integer age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Driver{" +
                " name = " + name +
                ", age = " + age +
                ", salary = " + salary + "}";
    }
}
