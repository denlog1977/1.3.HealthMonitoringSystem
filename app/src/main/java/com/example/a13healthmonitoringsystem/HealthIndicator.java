package com.example.a13healthmonitoringsystem;

public class HealthIndicator {

    double weight;
    int steps;

    public HealthIndicator(double weight, int steps) {
        this.weight = weight;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "Показатели здоровья: " +
                "вес " + weight +
                ", шаги " + steps;
    }
}
