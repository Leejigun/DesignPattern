package com.example.robinhood.designpattern.domain;

import com.example.robinhood.designpattern.domain.exercise.Exercise;

/**
 * Created by sean on 2017. 7. 9..
 */

public abstract class TimeExercise extends Exercise {
    protected long time; //ms 단위

    public TimeExercise(long time) {
        this.time = time;
    }
}
