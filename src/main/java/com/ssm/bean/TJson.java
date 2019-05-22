package com.ssm.bean;


import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TJson <T>{
    private int total;
    private List<T> rows;
    public TJson() {
    }

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
}
