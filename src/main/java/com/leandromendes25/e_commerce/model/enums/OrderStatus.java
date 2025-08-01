package com.leandromendes25.e_commerce.model.enums;

public enum OrderStatus {
    PENDING("pending"),PAID("paid"),SHIPPED("shipped"),CANCELED("canceled");

    private String statusOrder;

    OrderStatus(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public String getStatusOrder() {
        return statusOrder;
    }
}
