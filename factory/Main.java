package de.dastyle.factory;

/**
 * Created by a developer on 25.01.16.
 */
public class Main {

    public static void main(String[] args){

        VehicleFactory vf = new VehicleFactory();

        IFahrzeuge auto = vf.erzeugeFahrzeug(VehicleFactory.AUTO);
        IFahrzeuge motorrad = vf.erzeugeFahrzeug(VehicleFactory.MOTORRAD);

        System.out.println("AUTO from factory -> tires: " + auto.getAnzahlRaeder() + " type: " + auto.getType());
        System.out.println("MOTORRAD from factory -> tires: " + motorrad.getAnzahlRaeder() + " type: " + motorrad.getType());
    }
}
