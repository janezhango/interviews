package io.janezhango.generic;

/**
 * Created by xiaojing on 12/28/2017.
 */
public enum AbstractTrafficLightState // note the abstract
{
    RED(30) {
        public AbstractTrafficLightState next() {
            return GREEN;
        }
    },
    AMBER(10) { public AbstractTrafficLightState next() { return RED; } },
    GREEN(40) { public AbstractTrafficLightState next() { return AMBER; } };

    private final int duration;
    AbstractTrafficLightState(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public abstract AbstractTrafficLightState next();
}
