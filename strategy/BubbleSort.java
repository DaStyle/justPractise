package de.dastyle.strategy;

/**
 * Created by a developer on 24.01.16.
 */
public class BubbleSort extends ASort {

    public int[] sort(int[] array){
        int k;

        int[] intArray = array.clone();

        for (int i = 1; i < (intArray.length); i++) {
            for(int j = 0; j < intArray.length - i; j++) {
                if(intArray[j] > intArray[j + 1]) {
                    k = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = k;
                }

            }
        }

        return intArray;
    }
}
