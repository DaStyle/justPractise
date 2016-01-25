package de.dastyle.factory;

/**
 * Created by a developer on 25.01.16.
 */
public class VehicleFactory {

    public static final int AUTO = 0;
    public static final int MOTORRAD = 1;

    public IFahrzeuge erzeugeFahrzeug(int typ){
        switch (typ){
            case AUTO: return new Auto();
            case MOTORRAD: return new Motorrad();
            default: throw new
                    IllegalArgumentException("Wrong input. Not a valid vehicle number!");
        }
    }
}
