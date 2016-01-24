package de.dennis.strategy;

/**
 * Created by dafamily on 24.01.16.
 */
public class Bulldogge extends AHund {
    @Override
    public String bellen() {
        return "Laut und Gefährlich!";
    }

    @Override
    public String laufen() {
        return "Mäßig schnell...";
    }
}
