package app;

import java.util.Arrays;
import java.util.Random;

import static app.ArrayUtils.binarySearch;
import static app.ArrayUtils.mergeSort;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println("Initial array: " + Arrays.toString(array));

        mergeSort (array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int target = random.nextInt(100);
        System.out.println("Target number for search: " + target);
        int result = binarySearch(array, target);

        if (result != -1) {
            System.out.println("Target position is: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
