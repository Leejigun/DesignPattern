package com.example.robinhood.designpattern.domain.exercise.anaerobic;

import android.util.Log;

/**
 * Created by sean on 2017. 7. 9..
 */

public class Squat extends Anaerobic {

    public Squat(int cycle, int count) {
        super(cycle, count, Locomotor.GLUTES);
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! Squat for your " + locomotor.name() + " cycle "+ cycle + "count " + count);
    }
}
