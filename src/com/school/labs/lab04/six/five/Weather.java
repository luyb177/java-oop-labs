package com.school.labs.lab04.six.five;

public class Weather {
    WeatherState state;

    public void show() {
        state.showState();
    }

    public void setState(WeatherState s) {
        state = s;
    }
}