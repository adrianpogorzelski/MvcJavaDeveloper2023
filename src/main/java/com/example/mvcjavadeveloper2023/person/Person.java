package com.example.mvcjavadeveloper2023.person;

import java.util.Date;

public class Person {
    public Integer id;
    public String username;
    public String email;
    public boolean enabled;
    public Date lastLoginDate;

    public Person(Integer id, String username, String email, boolean enabled, Date lastLoginDate) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.enabled = enabled;
        this.lastLoginDate = lastLoginDate;
    }
}
