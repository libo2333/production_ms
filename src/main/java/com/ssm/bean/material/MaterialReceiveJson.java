package com.ssm.bean.material;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaterialReceiveJson {
    int total;
    List<Material_receive> rows;

    public MaterialReceiveJson(int total, List<Material_receive> rows) {
        this.total = total;
        this.rows = rows;
    }

    public MaterialReceiveJson() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Material_receive> getRows() {
        return rows;
    }

    public void setRows(List<Material_receive> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "MaterialReceiveJson{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
