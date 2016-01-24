package de.dastyle.strategy;

/**
 * Created by a developer on 24.01.16.
 */
public class SelectionSort extends ASort{

    public int[] sort(int[] array){

        int[] intArray = array.clone();

        for (int i = 0; i < (intArray.length - 1); i++) {

            int index = i;
            for (int j = i + 1; j < intArray.length; j++)
                if (intArray[j] < intArray[index])
                    index = j;

            int smallerNumber = intArray[index];
            intArray[index] = intArray[i];
            intArray[i] = smallerNumber;
        }

        return intArray;
    }
}
