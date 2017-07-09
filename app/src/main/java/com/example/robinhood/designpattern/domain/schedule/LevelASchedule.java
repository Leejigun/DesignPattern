package com.example.robinhood.designpattern.domain.schedule;

import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.aerobic.Aerobic;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Anaerobic;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Locomotor;

/**
 * Created by sean on 2017. 7. 9..
 */

public class LevelASchedule implements ExerciseSchedule {

    @Override
    public Exercise warmUp() {
        return null;
    }

    @Override
    public Exercise doStepOne() {
        return null;
    }

    @Override
    public Exercise doStepTwo() {
        return null;
    }

    @Override
    public Exercise doStepThree() {
        return null;
    }

    @Override
    public Anaerobic doAnaerobic(Locomotor locomotor) {
        return null;
    }

    @Override
    public Aerobic doAerobic() {
        return null;
    }
}
