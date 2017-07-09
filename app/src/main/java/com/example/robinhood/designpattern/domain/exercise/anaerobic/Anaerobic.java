package com.example.robinhood.designpattern.domain.exercise.anaerobic;

import com.example.robinhood.designpattern.domain.exercise.Exercise;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public abstract class Anaerobic extends Exercise {
    private int cycle;

    private int weight;

    private int count;

    protected Locomotor locomotor;

    protected Set<Locomotor> multiLocomotor;

    public Anaerobic(int cycle, int count, Locomotor locomotor) {
        this.locomotor = locomotor;
        this.cycle = cycle;
        this.count = count;
        multiLocomotor = new HashSet<>();
    }

    public void addLocomotor(Locomotor locomotor) {
        multiLocomotor.add(locomotor);
    }

}
