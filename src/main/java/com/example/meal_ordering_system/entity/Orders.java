package com.example.meal_ordering_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Orders  {

    private Integer id;

    private Integer userid;

    private Integer menuid;

    private Integer menusum;

    private String times;

    private Integer delivery;

    private Users users;

    private Menus menus;

    public Orders() {
    }

    public Orders(Integer id, Integer userid, Integer menuid, Integer menusum, String times, Integer delivery, Users users, Menus menus) {
        this.id = id;
        this.userid = userid;
        this.menuid = menuid;
        this.menusum = menusum;
        this.times = times;
        this.delivery = delivery;
        this.users = users;
        this.menus = menus;
    }

    public Orders(Integer id, Integer userid, Integer menuid, Integer menusum, String times, Integer delivery) {
        this.id = id;
        this.userid = userid;
        this.menuid = menuid;
        this.menusum = menusum;
        this.times = times;
        this.delivery = delivery;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getMenusum() {
        return menusum;
    }

    public void setMenusum(Integer menusum) {
        this.menusum = menusum;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Menus getMenus() {
        return menus;
    }

    public void setMenus(Menus menus) {
        this.menus = menus;
    }
}