package com.example.robinhood.designpattern.factory;

import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.ExerciseType;
import com.example.robinhood.designpattern.domain.exercise.Tool;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public abstract class ExerciseTypeFactory {

    public abstract ExerciseFactory createTypeFactory(ExerciseType type, Calrorie calrorie, Tool tool);
}
