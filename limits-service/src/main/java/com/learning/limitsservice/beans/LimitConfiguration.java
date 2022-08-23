package com.learning.limitsservice.beans;


public class LimitConfiguration {
    private int maximum;
    private int minimum;

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public LimitConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public LimitConfiguration() {
    }

    @Override
    public String toString() {
        return "LimitConfiguration{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
