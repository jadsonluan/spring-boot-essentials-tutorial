package com.example.demo.model;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
public class Student extends AbstractEntity {
    @NotEmpty(message = "O campo nome é obrigatório")
    private String name;
    @Email
    @NotEmpty
    private String email;

    public Student(String name) {
        this.name = name;
    }

    public Student() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
