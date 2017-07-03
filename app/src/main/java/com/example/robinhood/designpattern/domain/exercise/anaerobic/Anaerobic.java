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

    protected Locomotor locomotor;

    protected Set<Locomotor> multiLocomotor;

    public Anaerobic(Locomotor locomotor) {
        this.locomotor = locomotor;
        multiLocomotor = new HashSet<>();
    }

    public void addLocomotor(Locomotor locomotor) {
        multiLocomotor.add(locomotor);
    }

}
