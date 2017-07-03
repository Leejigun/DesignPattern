package com.example.robinhood.designpattern.factory;

import com.example.robinhood.designpattern.domain.Human;
import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.Tool;
import com.example.robinhood.designpattern.domain.exercise.aerobic.AerobicType;
import com.example.robinhood.designpattern.domain.exercise.aerobic.RunExercise;
import com.example.robinhood.designpattern.domain.exercise.aerobic.StepperExercise;
import com.example.robinhood.designpattern.domain.exercise.aerobic.WalkExercise;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class AerobicExerciseFactory extends ExerciseFactory {

    private AerobicType type;

    public AerobicExerciseFactory(AerobicType type) {
        this.type = type;
    }

    @Override
    public Exercise createExercise(Human human, Calrorie calrorie, Tool tool) {
        if(human.getWeight() > human.getHeight()) {
            return new WalkExercise();
        } else {
            switch (type) {
                case RUN:
                    return new RunExercise();
                case STEP:
                    return new StepperExercise();
                case WALK:
                    return new WalkExercise();
            }
        }

        return new RunExercise();
    }

    @Override
    public Exercise createExercise(Human human) {
        return null;
    }
}
