package com.example.robinhood.designpattern.domain.exercise.core;

import android.util.Log;

import com.example.robinhood.designpattern.domain.exercise.CountExercise;
import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Anaerobic;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Locomotor;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class PushUp extends CountExercise {


    public PushUp(int count) {
        super(count);
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! PushUp " + count + "count");
    }
}
