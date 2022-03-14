package Lesson_2.INDIVIDUAL.Task_70;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Man {
    private String name;
    private String surname;
    private int age;

    private void runMan() {
        System.out.println("I'm running");
    }

    private void jumpMan() {
        System.out.println("I'm jumping");
    }

    private void walkMan() {
        System.out.println("I'm walking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void printInfoMan() {
        Field[] fields = Man.class.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println("Field - " + f);
        }
        Method[] methods = Man.class.getDeclaredMethods();
        for (Method m : methods) {
            m.setAccessible(true);
            System.out.println("Method - " + m);
        }
    }
}
