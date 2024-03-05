package com.example.meal_ordering_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class Pages implements Serializable {
    private static final long serialVersionUID=1L;
    private String currentpage="1";      //当前也是

    private int totalPageCount=1;      //总页数

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Pages(String currentpage, int totalPageCount) {
        this.currentpage = currentpage;
        this.totalPageCount = totalPageCount;
    }

    public Pages() {
    }

    public String getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(String currentpage) {
        this.currentpage = currentpage;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
}
