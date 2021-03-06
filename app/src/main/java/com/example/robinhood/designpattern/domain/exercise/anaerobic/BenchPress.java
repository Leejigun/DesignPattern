package com.example.robinhood.designpattern.domain.exercise.anaerobic;

import android.util.Log;

import java.util.Set;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class BenchPress extends Anaerobic {
    public BenchPress(int cycle, int count) {
        super(cycle, count, Locomotor.CHEST);
    }


    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! BenchPress for your " + locomotor.name() + " cycle "+ cycle + "count " + count);
    }
}
