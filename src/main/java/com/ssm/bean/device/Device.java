package com.ssm.bean.device;


import java.math.BigDecimal;
import java.util.Date;


import org.apache.ibatis.type.Alias;

import java.math.BigDecimal;
import java.util.Date;

@Alias("device")/*小名供查询返回*/

public class Device {
    private String deviceId;
    private String deviceName;
    private String deviceIdd;
    private String deviceTypeName;
    private String deviceTypeId;
    private String deviceStatusId;

    private String deviceStatus;

    private Date devicePurchaseDate;

    private BigDecimal devicePurchasePrice;

    private Date deviceManufactureDate;

    private Date deviceServiceLife;

    private String deviceKeeperId;


    private String note;

    private String deviceKeeper;

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    public String getDeviceKeeper() {
        return deviceKeeper;
    }

    public void setDeviceKeeper(String deviceKeeper) {
        this.deviceKeeper = deviceKeeper;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDeviceIdd() {
        return deviceIdd;
    }

    public void setDeviceIdd(String deviceIdd) {
        this.deviceIdd = deviceIdd;
    }

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public String getDeviceStatusId() {
        return deviceStatusId;
    }

    public void setDeviceStatusId(String deviceStatusId) {
        this.deviceStatusId = deviceStatusId;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public Date getDevicePurchaseDate() {
        return devicePurchaseDate;
    }

    public void setDevicePurchaseDate(Date devicePurchaseDate) {
        this.devicePurchaseDate = devicePurchaseDate;
    }

    public BigDecimal getDevicePurchasePrice() {
        return devicePurchasePrice;
    }

    public void setDevicePurchasePrice(BigDecimal devicePurchasePrice) {
        this.devicePurchasePrice = devicePurchasePrice;
    }

    public Date getDeviceManufactureDate() {
        return deviceManufactureDate;
    }

    public void setDeviceManufactureDate(Date deviceManufactureDate) {
        this.deviceManufactureDate = deviceManufactureDate;
    }

    public Date getDeviceServiceLife() {
        return deviceServiceLife;
    }

    public void setDeviceServiceLife(Date deviceServiceLife) {
        this.deviceServiceLife = deviceServiceLife;
    }

    public String getDeviceKeeperId() {
        return deviceKeeperId;
    }

    public void setDeviceKeeperId(String deviceKeeperId) {
        this.deviceKeeperId = deviceKeeperId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}