package com.example.robinhood.designpattern.domain;

import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.ExerciseType;
import com.example.robinhood.designpattern.domain.exercise.Tool;
import com.example.robinhood.designpattern.factory.ExerciseFactory;
import com.example.robinhood.designpattern.factory.ExerciseTypeFactory;
import com.example.robinhood.designpattern.factory.ExtremeExerciseTypeFactory;
import com.example.robinhood.designpattern.factory.NormalExerciseTypeFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class Human implements BaseModel {
    private String name;

    private int height;

    private int weight;

    private float bmi;

    private List<Exercise> todayExercises = new ArrayList<>();

    private ExerciseFactory exerciseFactory;

    private ExerciseTypeFactory typeFactory;

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bmi = weight / (height + 10);
        makeYourExerciseType();
    }


    public void setBmi(float bmi) {
        this.bmi = bmi;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public float getBmi() {
        return bmi;
    }

    public List<Exercise> getTodayExercises() {
        return todayExercises;
    }

    public void setExerciseFactory(ExerciseType type, Calrorie calrorie, Tool tool) {
        typeFactory.createTypeFactory(type, calrorie, tool);
    }

    public void doExercise(Calrorie calrorie, Tool tool) {
        Exercise exercise = exerciseFactory.createExercise(this, calrorie, tool);
        todayExercises.add(exercise);
    }

    public void doExercise() {
        Exercise exercise = exerciseFactory.createExercise(this);
        todayExercises.add(exercise);
    }

    private void makeYourExerciseType() {
        if (bmi > 0.2f) {
            typeFactory = new NormalExerciseTypeFactory();
        } else {
            typeFactory = new ExtremeExerciseTypeFactory();
        }
    }


    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                '}';
    }
}

