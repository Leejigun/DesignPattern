package com.example.robinhood.designpattern.domain.schedule;

import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.aerobic.Aerobic;
import com.example.robinhood.designpattern.domain.exercise.aerobic.RunExercise;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Anaerobic;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.BenchPress;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.DumbbellFly;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.DumbbellPress;
import com.example.robinhood.designpattern.domain.exercise.core.Crunch;
import com.example.robinhood.designpattern.domain.exercise.core.RaisedPlank;
import com.example.robinhood.designpattern.domain.exercise.core.Superman;
import com.example.robinhood.designpattern.domain.exercise.warmup.DynamicStretching;

/**
 * Created by sean on 2017. 7. 9..
 */

public class LevelASchedule implements ExerciseSchedule {


    @Override
    public Exercise warmUp() {
        return new DynamicStretching();
    }

    @Override
    public Exercise stepOne() {
        return new Superman(20);
    }

    @Override
    public Exercise stepTwo() {
        return new RaisedPlank(60 * 1000);
    }

    @Override
    public Exercise stepThree() {
        return new Crunch(30);
    }

    @Override
    public Anaerobic anaerobicStepOne() {
        return new BenchPress(5, 15);
    }

    @Override
    public Anaerobic anaerobicStepTwo() {
        return new DumbbellPress(5, 15);
    }

    @Override
    public Anaerobic anaerobicStepThree() {
        return new DumbbellFly(5, 15);
    }

    @Override
    public Aerobic aerobic() {
        return new RunExercise(40 * 60 * 1000);
    }
}
