package com.example.robinhood.designpattern.domain.exercise.anaerobic;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class DumbbellPress extends Anaerobic {

    public DumbbellPress(int cycle, int count) {
        super(cycle, count, Locomotor.CHEST);
    }


    @Override
    public void doExercise() {

    }
}
