package com.example.robinhood.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.robinhood.designpattern.domain.Human;
import com.example.robinhood.designpattern.domain.exercise.Barbell;
import com.example.robinhood.designpattern.domain.exercise.Body;
import com.example.robinhood.designpattern.domain.exercise.Calrorie;
import com.example.robinhood.designpattern.domain.exercise.Dumbbell;
import com.example.robinhood.designpattern.domain.exercise.Exercise;
import com.example.robinhood.designpattern.domain.exercise.ExerciseType;
import com.example.robinhood.designpattern.domain.exercise.Unit;
import com.example.robinhood.designpattern.domain.exercise.anaerobic.Locomotor;
import com.example.robinhood.designpattern.factory.AnaerobicFactory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Human me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        me = new Human("선일", 177, 86);

        Thread thread = new Thread(runnable) ;


        thread.start();
    }



    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            me.setExerciseFactory(ExerciseType.AEROBIC, new Calrorie(Unit.KCAL, 150, 5), new Body());
            me.doExercise();

            me.setExerciseFactory(ExerciseType.ANAEROBIC, new Calrorie(Unit.KCAL, 100, 10), new Barbell());
            me.doExercise();

            me.setExerciseFactory(ExerciseType.ANAEROBIC, new Calrorie(Unit.KCAL, 100, 10), new Dumbbell());
            me.doExercise();
            me.doExercise();


            for(Exercise exercise : me.getTodayExercises()) {
                Log.d("TEST", exercise.getClass().getSimpleName());
            }
        }
    };
}
