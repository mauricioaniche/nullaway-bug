package com.adyen.test;

public class SomeBusinessClass {
    
    public double execute(Entity entity, int a, int b) {
        Long age =
                entity != null
                        ? 123L
                        : null;

        boolean triggered;
        if (a > b) {
            triggered = age != null;
        } else {
            triggered = false;
        }

        double score = 1.0;
        if (triggered) {
            score = score - Utils.function(age);
        }
        return score;
    }
}
