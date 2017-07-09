package com.example.robinhood.designpattern.domain.exercise.aerobic;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class WalkExercise extends BodyTraningExercise {

    public WalkExercise(long time) {
        super(time);
    }

    @Override
    long burnCalrorie() {
        return 0;
    }

    @Override
    public void doExercise() {

    }
}
