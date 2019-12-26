package com.spacebound.hallmanagement;

public class StudentUser {
    public String name, email, phone;
    public String regNo, dept;

    public StudentUser() {

    }

    public StudentUser(String name, String email, String phone, String regNo, String dept) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.regNo = regNo;
        this.dept = dept;
    }

    String getName() {
        return name;
    }

    String getEmail() {
        return email;
    }

    String getPhone() {
        return phone;
    }

    String getRegNo() {
        return regNo;
    }

    String getDept() {
        return dept;
    }
}
