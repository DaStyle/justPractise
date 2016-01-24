package de.dastyle.strategy;

/**
 * Created by a developer on 24.01.16.
 */
public class Main {

    public static int[] intArray = {19, 2 ,4, 1, 7, 22, 3, 6, 33, 21};

    public static void main(String[] args){


        System.out.println("Start sorting!");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + 1 + ": " + intArray[i]);
        }

        ASort bubble = new BubbleSort();

        int[] sortetArray = bubble.sort(intArray);

        System.out.println("BubbleSort:");

        for (int i = 0; i < sortetArray.length; i++) {
            System.out.println(i + 1 + ": " + sortetArray[i]);
        }

        System.out.println("Original array:");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + 1 + ": " + intArray[i]);
        }

        ASort selection = new SelectionSort();

        int[] sortetArray2 = selection.sort(intArray);

        System.out.println("SelectionSort:");

        for (int i = 0; i < sortetArray2.length; i++) {
            System.out.println(i + 1 + ": " + sortetArray2[i]);
        }

        System.out.println("Original array:");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + 1 + ": " + intArray[i]);
        }
    }
}
