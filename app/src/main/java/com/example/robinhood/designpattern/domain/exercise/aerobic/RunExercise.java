package com.example.robinhood.designpattern.domain.exercise.aerobic;

import android.util.Log;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class RunExercise extends BodyTraningExercise {
    private long speed;

    public RunExercise(long time) {
        super(time);
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getSpeed() {
        return speed;
    }

    @Override
    long burnCalrorie() {
        return (time / 1000 / 60) * 10;
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "Run " + time + "time diet =" + burnCalrorie()+ "cal");
    }
}
