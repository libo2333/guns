package com.stylefeng.guns.rest.pay.bean;

import java.io.Serializable;

public class PayData implements Serializable {
    private String orderId;
    private String QRCodeAddress;
    private int orderStatus;
    private String orderMsg;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getQRCodeAddress() {
        return QRCodeAddress;
    }

    public void setQRCodeAddress(String QRCodeAddress) {
        this.QRCodeAddress = QRCodeAddress;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderMsg() {
        return orderMsg;
    }

    public void setOrderMsg(String orderMsg) {
        this.orderMsg = orderMsg;
    }

    @Override
    public String toString() {
        return "PayData{" +
                "orderId=" + orderId +
                ", QRCodeAddress='" + QRCodeAddress + '\'' +
                '}';
    }
}
