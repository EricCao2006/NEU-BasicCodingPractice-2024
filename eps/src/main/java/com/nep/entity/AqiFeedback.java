package com.nep.entity;

import java.io.Serializable;

public class AqiFeedback implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer afId;		//反馈信息编号
    private String afName;	//公众监督员姓名
    private String proviceName;	//省网格区域
    private String cityName;	//市网格区域
    private String address;		//具体地址
    private String infomation;	//详细反馈信息
    private String estimateGrade;//预估等级
    private String date;		//反馈日期
    private String state;		//反馈状态: 未指派,已指派,已实测
    private String gmName;		//指派网格员
    private String confirmDate;	//实测日期
    private Double so2;			//实测二氧化硫浓度
    private Double co;			//实测一氧化碳浓度
    private Double pm;			//实测PM2.5浓度
    private String confirmLevel;//实测AQI等级
    private String confirmExplain;//实测AQI等级描述

    //构造方法及setter/getter方法......
}
