package com.example.robinhood.designpattern.domain.exercise.aerobic;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class StepperExercise extends Aerobic {
    private long step;

    public void setStep(long step) {
        this.step = step;
    }

    public long getStep() {
        return step;
    }

    @Override
    long burnCalrorie() {
        return 0;
    }
}
