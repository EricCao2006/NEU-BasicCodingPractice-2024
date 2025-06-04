package com.nep.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProvinceCity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer provinceId;		//省区域编码
    private String provinceName;	//省区域名称
    private List<String> cityName = new ArrayList<String>();	//省所包含的市名称

    public void setProvinceId(int i) {
    }

    public void setProvinceName(String 黑龙江省) {
    }

    public void setCityName(List<String> city3) {

    }
    //构造方法及setter/getter方法......
}
