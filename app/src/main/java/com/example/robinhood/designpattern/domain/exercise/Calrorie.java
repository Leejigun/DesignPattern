package com.example.robinhood.designpattern.domain.exercise;

import com.example.robinhood.designpattern.domain.BaseModel;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class Calrorie implements BaseModel {
    private int calrorieHour; //목표

    private int calrorieMinute; //목표

    private Unit unit;

    public Calrorie(Unit unit, int calrorieHour, int calrorieMinute) {
        this.calrorieHour = calrorieHour;
        this.calrorieMinute = calrorieMinute;
        this.unit = unit;
    }
}
