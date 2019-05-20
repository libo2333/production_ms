package com.ssm.bean.material;

public class Material {
    private String materialId;

    private String workId;

    private String materialType;

    private String status;

    private Integer remaining;

    private String note;

    public Material(String materialId, String workId, String materialType, String status, Integer remaining, String note) {
        this.materialId = materialId;
        this.workId = workId;
        this.materialType = materialType;
        this.status = status;
        this.remaining = remaining;
        this.note = note;
    }

    public Material() {
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Material{" +
                "materialId='" + materialId + '\'' +
                ", workId='" + workId + '\'' +
                ", materialType='" + materialType + '\'' +
                ", status='" + status + '\'' +
                ", remaining=" + remaining +
                ", note='" + note + '\'' +
                '}';
    }
}
