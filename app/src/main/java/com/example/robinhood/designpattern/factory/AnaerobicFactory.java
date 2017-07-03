package com.example.robinhood.designpattern.factory;

import com.example.robinhood.designpattern.domain.Human;
import com.example.robinhood.designpattern.domain.exercise.Barbell;
import com.example.robinhood.designpattern.domain.exercise.Body;
import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.Dumbbell;
import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.Kettlebell;
import com.example.robinhood.designpattern.domain.exercise.Tool;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.BenchPress;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.DumbbellPress;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Locomotor;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Lunge;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Plank;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.PushUp;

import java.util.Random;

import static com.example.robinhood.designpattern.domain.exercise.anaerobic.Locomotor.ALL;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class AnaerobicFactory extends ExerciseFactory {

    private Locomotor locomotor;

    private Tool tool;

    public AnaerobicFactory(Locomotor locomotor, Tool tool) {
        this.locomotor = locomotor;
        this.tool = tool;
    }

    @Override
    public Exercise createExercise(Human human, Calrorie calrorie, Tool tool) {
        return getExercise(human, tool);
    }

    @Override
    public Exercise createExercise(Human human) {
        Tool exerciseTool;
        if(tool.equals(ALL)){
            exerciseTool = getRandomTool();
        }

        return getExercise(human, exerciseTool);
    }


    private Exercise getExercise(Human human, Tool tool) {
        Exercise exercise;
        switch (locomotor) {
            case CHEST:
                if (tool instanceof Barbell) {
                    exercise = new BenchPress();
                } else if (tool instanceof Dumbbell) {
                    exercise = new DumbbellPress();
                } else if (tool instanceof Body) {
                    exercise = new PushUp();
                } else {
                    exercise = new Plank();
                }
                break;
            case HAMSTRINGS:
                exercise = new Lunge();
                break;
            default:
                exercise = new Plank();
        }
        return exercise;
    }


    private Tool getRandomTool() {
        Random random = new Random(4);
        int type = random.nextInt();



        switch (type) {
            case 0:
                return new Barbell();
            case 1:
                return new Dumbbell();
            case 2:
                return new Kettlebell();
            case 3:
                return new Body();
            default:
                return new Body();
        }
    }
}
