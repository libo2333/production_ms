package com.ssm.bean.material;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MaterialJson {
    int total;
    List<Material> rows;

    public MaterialJson(int total, List<Material> rows) {
        this.total = total;
        this.rows = rows;
    }

    public MaterialJson() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Material> getRows() {
        return rows;
    }

    public void setRows(List<Material> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "MaterialJson{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
