package com.fxj.core.bean;

import java.io.Serializable;

/**
 * @author faver
 */
public class Orders implements Serializable {
    private Integer orderId;

    private String  orderNumber;

    private String orderPrice;

    private String pid;

    private Person person;

    public Integer getOrderId() {
        return orderId;
    }

    public Orders setOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public Orders setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public Orders setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }

    public String getPid() {
        return pid;
    }

    public Orders setPid(String pid) {
        this.pid = pid;
        return this;
    }

    public Person getPerson() {
        return person;
    }

    public Orders setPerson(Person person) {
        this.person = person;
        return this;
    }
}
