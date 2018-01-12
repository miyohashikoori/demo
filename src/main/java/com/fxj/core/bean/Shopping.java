package com.fxj.core.bean;

import java.io.Serializable;

/**
 * @author faver
 */
public class Shopping implements Serializable {
    private String id;

    private String  username;


    public String getId() {
        return id;
    }

    public Shopping setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Shopping setUsername(String username) {
        this.username = username;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
