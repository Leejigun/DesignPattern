package com.example.robinhood.designpattern.domain.schedule;

import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.aerobic.Aerobic;
import com.example.robinhood.designpattern.domain.exercise.aerobic.WalkExercise;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Anaerobic;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.BenchPress;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Locomotor;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Lunge;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Squat;
import com.example.robinhood.designpattern.domain.exercise.core.Crunch;
import com.example.robinhood.designpattern.domain.exercise.core.Plank;
import com.example.robinhood.designpattern.domain.exercise.core.PushUp;
import com.example.robinhood.designpattern.domain.exercise.warmup.StaticStretching;

/**
 * Created by sean on 2017. 7. 9..
 */

public class BeginnerSchedule implements ExerciseSchedule {

    @Override
    public Exercise warmUp() {
        return new StaticStretching();
    }

    @Override
    public Exercise stepOne() {
        return new Crunch(50); // 횟수;
    }

    @Override
    public Exercise stepTwo() {
        return new PushUp(15);
    }

    @Override
    public Exercise stepThree() {
        return new Plank(60 * 1000);
    }

    @Override
    public Anaerobic anaerobicStepOne() {
        return new Squat(3, 20);
    }

    @Override
    public Anaerobic anaerobicStepTwo() {
        return new Lunge(3, 15);
    }

    @Override
    public Anaerobic anaerobicStepThree() {
        return new BenchPress(3, 15);
    }

    @Override
    public Aerobic aerobic() {
        return new WalkExercise(1000 * 60 * 30);
    }
}
