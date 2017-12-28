package io.janezhango.generic;

/**
 * Created by xiaojing on 12/28/2017.
 */
public enum TrafficLightState {
    RED(30), // constructor call
    AMBER(10),
    GREEN(40); // note the semi-colon

    // field
    private final int duration;

    // constructor
    TrafficLightState(int duration) {
        this.duration = duration;
    }

    // method
    public int getDuration() {
        return duration;
    }
}
