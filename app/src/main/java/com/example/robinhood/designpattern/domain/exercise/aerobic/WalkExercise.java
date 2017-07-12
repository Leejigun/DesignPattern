package com.example.robinhood.designpattern.domain.exercise.aerobic;

import android.util.Log;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class WalkExercise extends BodyTraningExercise {

    public WalkExercise(long time) {
        super(time);
    }

    @Override
    long burnCalrorie() {
        return (time / 1000 / 60) * 3;
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "Walk " + time + "time diet =" + burnCalrorie()+ "cal");
    }
}
