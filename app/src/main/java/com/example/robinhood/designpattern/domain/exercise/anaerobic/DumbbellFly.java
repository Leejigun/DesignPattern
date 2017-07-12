package com.example.robinhood.designpattern.domain.exercise.anaerobic;

import android.util.Log;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class DumbbellFly extends Anaerobic {

    public DumbbellFly(int cycle, int count) {
        super(cycle, count, Locomotor.CHEST);
    }


    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! DumbbellFly for your " + locomotor.name() + " cycle "+ cycle + "count " + count);
    }
}
