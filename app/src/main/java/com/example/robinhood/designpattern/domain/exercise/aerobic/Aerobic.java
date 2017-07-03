package com.example.robinhood.designpattern.domain.exercise.aerobic;

import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.Exercise;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public abstract class Aerobic extends Exercise {
    private long spendTime;

    public Aerobic() {
    }

    public void setSpendTime(long spendTime) {
        this.spendTime = spendTime;
    }

    public long getSpendTime() {
        return spendTime;
    }

    abstract long burnCalrorie();
}
