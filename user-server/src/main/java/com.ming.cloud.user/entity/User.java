package com.ming.cloud.user.entity;

import java.io.Serializable;

/**
 * Create on 2019-07-14.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 977293799769339171L;

    private int id;
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
