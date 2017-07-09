package com.example.robinhood.designpattern.domain.exercise.anaerobic;

import java.util.Set;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class BenchPress extends Anaerobic {
    private int count;

    public BenchPress(int cycle, int count) {
        super(cycle, count, Locomotor.CHEST);
    }


    @Override
    public void doExercise() {

    }
}
