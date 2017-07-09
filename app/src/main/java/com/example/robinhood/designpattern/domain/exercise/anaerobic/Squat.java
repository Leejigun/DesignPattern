package com.example.robinhood.designpattern.domain.exercise.anaerobic;

/**
 * Created by sean on 2017. 7. 9..
 */

public class Squat extends Anaerobic {

    public Squat(int cycle, int count) {
        super(cycle, count, Locomotor.ALL);
    }

    @Override
    public void doExercise() {

    }
}
