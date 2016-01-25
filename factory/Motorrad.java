package de.dastyle.factory;

/**
 * Created by a developer on 25.01.16.
 */
public class Motorrad implements IFahrzeuge {
    @Override
    public int getAnzahlRaeder() {
        return 2;
    }

    @Override
    public String getType() {
        return "Motorrad";
    }
}
