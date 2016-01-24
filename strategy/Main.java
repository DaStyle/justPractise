package de.dennis.strategy;

/**
 * Created by dafamily on 24.01.16.
 */
public class Main {

    public static void main(String[] args){

        AHund pudel = new Pudel();
        AHund bd = new Bulldogge();

        System.out.println("PUDEL: " + pudel.bellen());
        System.out.println("BULLDOGGE: " + bd.bellen());
    }
}
