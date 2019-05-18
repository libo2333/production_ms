package com.ssm.bean.qualitybean;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QualityJson<T> {
    int total;
    List<T> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
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
