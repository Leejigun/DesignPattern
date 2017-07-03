package com.example.robinhood.designpattern.factory;

import com.example.robinhood.designpattern.domain.Human;
import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.Tool;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public abstract class ExerciseFactory {

    abstract public Exercise createExercise(Human human, Calrorie calrorie, Tool tool);

    abstract public Exercise createExercise(Human human);
}
