package com.example.robinhood.designpattern.domain;

import android.net.Uri;
import android.support.annotation.NonNull;

import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.schedule.ExerciseSchedule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class Customer implements BaseModel {
    private String name;

    private int height;

    private int weight;

    private float bmi;

    private List<Exercise> todayExercises = new ArrayList<>();

    private Customer(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bmi = weight / (height + 10);
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

    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                '}';
    }

    public void makeitTodaySchedule(ExerciseSchedule schedule) {
        if (todayExercises == null) {
            todayExercises = new ArrayList<>();
        }

        todayExercises.clear();

        todayExercises.add(schedule.warmUp()); //스트레칭

        //코어운동 한싸이클
        todayExercises.add(schedule.stepOne());
        todayExercises.add(schedule.stepTwo());
        todayExercises.add(schedule.stepThree());

        todayExercises.add(schedule.stepOne());
        todayExercises.add(schedule.stepTwo());
        todayExercises.add(schedule.stepThree());

        todayExercises.add(schedule.stepOne());
        todayExercises.add(schedule.stepTwo());
        todayExercises.add(schedule.stepThree());

        todayExercises.add(schedule.anaerobicStepOne());
        todayExercises.add(schedule.anaerobicStepTwo());
        todayExercises.add(schedule.anaerobicStepThree());
        todayExercises.add(schedule.aerobic());
    }


    public void doitExercise() {
        for (Exercise exercise : todayExercises) {
            exercise.doExercise();
        }
    }


    public static class Builder {
        private String name;

        private int height;

        private int weight;

        public Builder(@NonNull String name) {
            this.name = name;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer(name, height, weight);
            return customer;
        }
    }
}

