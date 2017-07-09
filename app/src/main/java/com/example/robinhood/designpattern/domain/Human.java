package com.example.robinhood.designpattern.domain;

import com.example.robinhood.designpattern.domain.exercise.Exercise;

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

    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.bmi = weight / (height + 10);
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

    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", bmi=" + bmi +
                '}';
    }
}

