package com.nuzhd.adymnarscheduleapp.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    protected String login;
    protected String password;

    public String getFullName() {
        return String.format("%s %s %s", lastName, firstName, middleName);
    }

    @Transient
    protected Role userRole;

    public AppUser() {
    }

    public AppUser(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Role getUserRole() {
        return userRole;
    }

    public void setUserRole(Role userRole) {
        this.userRole = userRole;
    }
}
