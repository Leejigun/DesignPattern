package com.example.robinhood.designpattern.domain.exercise.aerobic;

import com.example.robinhood.designpattern.domain.exercise.TimeExercise;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public abstract class Aerobic extends TimeExercise {
    private long spendTime; //진행된 시간

    public Aerobic(long time) {
        super(time);
    }

    public void setSpendTime(long spendTime) {
        this.spendTime = spendTime;
    }

    public long getSpendTime() {
        return spendTime;
    }

    abstract long burnCalrorie();
}
