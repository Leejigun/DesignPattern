package com.example.robinhood.designpattern.domain.exercise.core;

import android.util.Log;

import com.example.robinhood.designpattern.domain.exercise.CountExercise;
import com.example.robinhood.designpattern.domain.exercise.Exercise;

/**
 * Created by sean on 2017. 7. 9..
 */

public class Crunch extends CountExercise {

    public Crunch(int count) {
        super(count);
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! Crunch " + count + "count");
    }
}
