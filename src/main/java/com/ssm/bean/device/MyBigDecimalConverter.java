package com.ssm.bean.device;

import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

public class MyBigDecimalConverter implements Converter<String,BigDecimal> {
    @Override
    public BigDecimal convert(String s) {g
        return   new BigDecimal(s);
    }
}
