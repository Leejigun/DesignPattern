package com.example.robinhood.designpattern.domain.schedule;

import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.aerobic.Aerobic;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Anaerobic;

/**
 * Created by sean on 2017. 7. 9..
 */

public interface ExerciseSchedule {

    Exercise warmUp();

    Exercise stepOne();

    Exercise stepTwo();

    Exercise stepThree();

    Anaerobic anaerobicStepOne();

    Anaerobic anaerobicStepTwo();

    Anaerobic anaerobicStepThree();

    Aerobic aerobic();
}
