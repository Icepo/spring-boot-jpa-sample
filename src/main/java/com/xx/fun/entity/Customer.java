package com.xx.fun.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * Created by Alex on 2016/10/26.
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private long ctime;

    public Customer() {
    }

    public Customer(String name, long ctime){
        this.name = name;
        this.ctime = ctime;
    }

    public Customer(long id, String name, long ctime) {
        this.id = id;
        this.name = name;
        this.ctime = ctime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCtime() {
        return ctime;
    }

    public void setCtime(long ctime) {
        this.ctime = ctime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ctime='" + ctime + '\'' +
                '}';
    }
}
