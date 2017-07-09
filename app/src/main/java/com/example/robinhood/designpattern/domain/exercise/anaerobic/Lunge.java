package com.example.robinhood.designpattern.domain.exercise.anaerobic;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class Lunge extends Anaerobic {
    private int count;

    public Lunge(int cycle, int count) {
        super(cycle, count, Locomotor.HAMSTRINGS);
    }

    @Override
    public void doExercise() {

    }
}
