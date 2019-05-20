package com.ssm.bean.technology;

import java.util.List;

public class ResponseVo<T> {
    List<T> rows;
    long total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "rows=" + rows +
                ", total=" + total +
                '}';
    }
}
