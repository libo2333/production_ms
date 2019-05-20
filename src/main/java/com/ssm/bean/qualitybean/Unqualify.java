package com.ssm.bean.qualitybean;

import com.ssm.bean.person.Employee;

import java.util.Date;

public class Unqualify {
    private String unqualifyApplyId;
    private String productName;
    private String productId;
    private String unqualifyItem;
    private Integer unqualifyCount;
    private String assemblyDate;
    private String empName;
    private String empId;
    private String applyDate;
    private String note;
    private String unqualifyParams;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUnqualifyApplyId() {
        return unqualifyApplyId;
    }

    public void setUnqualifyApplyId(String unqualifyApplyId) {
        this.unqualifyApplyId = unqualifyApplyId == null ? null : unqualifyApplyId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public String getUnqualifyItem() {
        return unqualifyItem;
    }

    public void setUnqualifyItem(String unqualifyItem) {
        this.unqualifyItem = unqualifyItem == null ? null : unqualifyItem.trim();
    }

    public Integer getUnqualifyCount() {
        return unqualifyCount;
    }

    public void setUnqualifyCount(Integer unqualifyCount) {
        this.unqualifyCount = unqualifyCount;
    }

    public String getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empId) {
        this.empName = empId == null ? null : empId.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getUnqualifyParams() {
        return unqualifyParams;
    }

    public void setUnqualifyParams(String unqualifyParams) {
        this.unqualifyParams = unqualifyParams;
    }

    public Unqualify(String unqualifyApplyId, String productName, String productId, String unqualifyItem, Integer unqualifyCount, String assemblyDate, String empName, String empId, String applyDate, String note) {
        this.unqualifyApplyId = unqualifyApplyId;
        this.productName = productName;
        this.productId = productId;
        this.unqualifyItem = unqualifyItem;
        this.unqualifyCount = unqualifyCount;
        this.assemblyDate = assemblyDate;
        this.empName = empName;
        this.empId = empId;
        this.applyDate = applyDate;
        this.note = note;
    }

    public Unqualify() {
    }
}