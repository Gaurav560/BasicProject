package com.telusko.basicproj;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Student {
    @Id
    private int rollnp;
    private int marks;
    private String name;

    public int getRollnp() {
        return rollnp;
    }

    public void setRollnp(int rollnp) {
        this.rollnp = rollnp;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollnp=" + rollnp + ", marks=" + marks + ", name=" + name + "]";
    }
}