package com.fxj.core.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author faver
 */
public class Person implements Serializable {
    private Integer personid;

    private String  personName;

    private String personAddress;

    private String personTel;

    private List<Orders> ordersLise;


    public Integer getPersonid() {
        return personid;
    }

    public Person setPersonid(Integer personid) {
        this.personid = personid;
        return this;
    }

    public String getPersonName() {
        return personName;
    }

    public Person setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public Person setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
        return this;
    }

    public String getPersonTel() {
        return personTel;
    }

    public Person setPersonTel(String personTel) {
        this.personTel = personTel;
        return this;
    }

    public List<Orders> getOrdersLise() {
        return ordersLise;
    }

    public Person setOrdersLise(List<Orders> ordersLise) {
        this.ordersLise = ordersLise;
        return this;
    }
}
