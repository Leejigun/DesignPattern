package com.example.robinhood.designpattern.domain.exercise.core;

import android.util.Log;

import com.example.robinhood.designpattern.domain.exercise.TimeExercise;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class Plank extends TimeExercise {


    public Plank(long time) {
        super(time);
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! Plank " + time + "ms");
    }
}
