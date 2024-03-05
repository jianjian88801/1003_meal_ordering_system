package com.example.meal_ordering_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Menus  {

    private Integer id;

    private String name;

    private Integer typeid;

    private String burden;

    private String brief;

    private Float price;

    private Integer sums;

    private Float price1;

    private Integer sums1;

    private String imgpath;

    public Menus() {
    }

    public Menus(Integer id, String name, Integer typeid, String burden, String brief, Float price, Integer sums, Float price1, Integer sums1, String imgpath) {
        this.id = id;
        this.name = name;
        this.typeid = typeid;
        this.burden = burden;
        this.brief = brief;
        this.price = price;
        this.sums = sums;
        this.price1 = price1;
        this.sums1 = sums1;
        this.imgpath = imgpath;
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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getSums() {
        return sums;
    }

    public void setSums(Integer sums) {
        this.sums = sums;
    }

    public Float getPrice1() {
        return price1;
    }

    public void setPrice1(Float price1) {
        this.price1 = price1;
    }

    public Integer getSums1() {
        return sums1;
    }

    public void setSums1(Integer sums1) {
        this.sums1 = sums1;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }
}