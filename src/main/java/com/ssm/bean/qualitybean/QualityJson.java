package com.ssm.bean.qualitybean;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QualityJson {
    int total;
    List<Unqualify> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Unqualify> getRows() {
        return rows;
    }

    public void setRows(List<Unqualify> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "QualityJson{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
