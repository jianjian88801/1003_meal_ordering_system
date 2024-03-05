package com.example.meal_ordering_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Users  {

    private Integer id;

    private String name;

    private String pwd;

    private String realname;

    private String sex;

    private Integer age;

    private String card;

    private String address;

    private String phone;

    private String email;

    private String code;

    private Integer type;

    public Users() {
    }

    public Users(String name, String pwd, String realname, String sex, Integer age, String card, String address, String phone, String email, String code, Integer type) {
        this.name = name;
        this.pwd = pwd;
        this.realname = realname;
        this.sex = sex;
        this.age = age;
        this.card = card;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.code = code;
        this.type = type;
    }

    public Users(Integer id, String name, String pwd, String realname, String sex, Integer age, String card, String address, String phone, String email, String code, Integer type) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.realname = realname;
        this.sex = sex;
        this.age = age;
        this.card = card;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.code = code;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}