package com.nep.entity;

import java.io.Serializable;

public class Aqi implements Serializable {
    private static final long serialVersionUID = 1L;
    private String level;			//AQI指数级别
    private String explain;			//AQI指数描述
    private String impact;			//对健康的影响
    //构造方法及setter/getter方法......
}
