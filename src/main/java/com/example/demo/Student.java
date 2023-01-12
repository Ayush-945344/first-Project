package com.example.demo;

import jakarta.persistence.*;

@Entity(name="student")
@Table(name="student",uniqueConstraints = {
        @UniqueConstraint(name = "student_emil_unique",columnNames = "email")
})
public class Student {

    @Id
    @SequenceGenerator(name="student_sequence",sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="student_sequence" )
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String email;
    private Integer age;

    public Student() {
    }

    public Student( String firstname, String lastName, String email, Integer age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
