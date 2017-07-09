package com.example.robinhood.designpattern.domain.exercise;

/**
 * Created by sean on 2017. 7. 9..
 */

public abstract class CountExercise extends Exercise {
    protected int count;

    public CountExercise(int count) {
        this.count = count;
    }
}
