package de.dastyle.factory;

/**
 * Created by a developer on 25.01.16.
 */
public class Auto implements IFahrzeuge {
    @Override
    public int getAnzahlRaeder() {
        return 4;
    }

    @Override
    public String getType() {
        return "Auto";
    }
}
