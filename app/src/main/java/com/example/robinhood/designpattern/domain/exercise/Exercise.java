package com.example.robinhood.designpattern.domain.exercise;

import com.example.robinhood.designpattern.domain.BaseModel;
import com.example.robinhood.designpattern.domain.exercise.tool.Tool;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public abstract class Exercise implements BaseModel {
    Tool tool;

    public abstract void doExercise();
}
