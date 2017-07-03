package com.example.robinhood.designpattern.factory;

import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.ExerciseType;
import com.example.robinhood.designpattern.domain.exercise.Tool;

import static com.example.robinhood.designpattern.domain.exercise.aerobic.AerobicType.RUN;
import static com.example.robinhood.designpattern.domain.exercise.aerobic.AerobicType.WALK;
import static com.example.robinhood.designpattern.domain.exercise.anaerobic.Locomotor.ALL;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class NormalExerciseTypeFactory extends ExerciseTypeFactory {

    @Override
    public ExerciseFactory createTypeFactory(ExerciseType type, Calrorie calrorie, Tool tool) {
        ExerciseFactory exerciseFactory;

        switch (type) {
            case AEROBIC:
                //TODO Calrorie나 tool에 따라 생성가능한 운동이 제한된 Factory 생성
                exerciseFactory = new AerobicExerciseFactory(WALK);
                break;
            case ANAEROBIC:
                exerciseFactory = new AnaerobicFactory(ALL, tool);
                break;
            default:
                exerciseFactory = new AerobicExerciseFactory(RUN);
        }

        return exerciseFactory;
    }
}
