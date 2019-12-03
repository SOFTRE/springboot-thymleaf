package com.xxM.model;

/**
 * @Program: IntelliJ IDEA 
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-12-01 16:29:23 周日
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public class User {
    private Integer id;
    private String name;
    private String address;

    public User(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
