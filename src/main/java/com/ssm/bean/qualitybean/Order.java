package com.ssm.bean.qualitybean;

import org.joda.time.DateTime;

import java.math.BigDecimal;

public class Order {
    String order_id;
    String custom_id;
    String product_id;
    DateTime order_date;
    DateTime request_date;
    String note;
    int quantity;
    BigDecimal unit_price;
    String unit;
    String image;
    String file;
    int status;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getCustom_id() {
        return custom_id;
    }

    public void setCustom_id(String custom_id) {
        this.custom_id = custom_id;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public DateTime getOrder_date() {
        return order_date;
    }

    public void setOrder_date(DateTime order_date) {
        this.order_date = order_date;
    }

    public DateTime getRequest_date() {
        return request_date;
    }

    public void setRequest_date(DateTime request_date) {
        this.request_date = request_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(BigDecimal unit_price) {
        this.unit_price = unit_price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
