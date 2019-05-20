package com.ssm.bean.material;

public class Material_receive {
    private String receiveId;

    private String materialId;

    private Integer amount;

    private String receiveDate;

    private String sender;

    private String receiver;

    private String note;

    public Material_receive(String receiveId, String materialId, Integer amount, String receiveDate, String sender, String receiver, String note) {
        this.receiveId = receiveId;
        this.materialId = materialId;
        this.amount = amount;
        this.receiveDate = receiveDate;
        this.sender = sender;
        this.receiver = receiver;
        this.note = note;
    }

    public Material_receive() {
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Material_receive{" +
                "receiveId='" + receiveId + '\'' +
                ", materialId='" + materialId + '\'' +
                ", amount=" + amount +
                ", receiveDate='" + receiveDate + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
