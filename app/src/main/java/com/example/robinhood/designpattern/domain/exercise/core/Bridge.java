package com.example.robinhood.designpattern.domain.exercise.core;

import com.example.robinhood.designpattern.domain.TimeExercise;
import com.example.robinhood.designpattern.domain.exercise.Exercise;

/**
 * Created by sean on 2017. 7. 9..
 */

public class Bridge extends TimeExercise {


    public Bridge(long time) {
        super(time);
    }

    @Override
    public void doExercise() {

    }
}
