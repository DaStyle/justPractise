package de.dennis.strategy;

/**
 * Created by dafamily on 24.01.16.
 */
public class Pudel extends AHund {
    @Override
    public String bellen() {
        return "(Pudel) Laut und nervig!";
    }

    @Override
    public String laufen() {
        return "(Pudel) Mäßig schnell und zimperlich...";
    }
}
