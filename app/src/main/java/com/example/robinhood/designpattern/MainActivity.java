package com.example.robinhood.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.robinhood.designpattern.domain.Customer;
import com.example.robinhood.designpattern.domain.schedule.BeginnerSchedule;
import com.example.robinhood.designpattern.domain.schedule.LevelASchedule;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Customer expert = new Customer.Builder("전문가").setHeight(183).setWeight(77).build();
        Customer beginner = new Customer.Builder("초보자").setHeight(177).setWeight(77).build();

        expert.makeitTodaySchedule(new LevelASchedule());
        beginner.makeitTodaySchedule(new BeginnerSchedule());


        Thread doitBeginner = new Thread(new ExerciseRunnable(beginner));
        Thread doitExpert  = new Thread(new ExerciseRunnable(expert));

        doitBeginner.start();
        doitExpert.start();

    }




    private class ExerciseRunnable implements Runnable {
        Customer customer;

        public ExerciseRunnable(Customer customer) {
            this.customer = customer;
        }

        @Override
        public void run() {
            if(customer != null) {
                customer.doitExercise();
            }
        }
    }
}
