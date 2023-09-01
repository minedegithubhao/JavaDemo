package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    @Autowired
    private Dog dog;

    private String name;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        dog.shot();
    }

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
