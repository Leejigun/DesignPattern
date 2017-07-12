package com.example.robinhood.designpattern.domain.exercise.anaerobic;

import android.util.Log;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class InclineBenchPress extends Anaerobic {
    private int count;

    public InclineBenchPress(int cycle, int count) {
        super(cycle, count, Locomotor.CHEST);
    }


    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! InclineBenchPress for your " + locomotor.name() + " cycle "+ cycle + "count " + count);
    }
}
