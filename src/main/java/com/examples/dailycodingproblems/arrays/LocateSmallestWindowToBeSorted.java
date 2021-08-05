package com.examples.dailycodingproblems.arrays;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class LocateSmallestWindowToBeSorted {

    
    /**
     * Given array of integers that are out of order, determine the bounds 
     * of the smallest window that must be sorted in order for the entire 
     * array to be sorted. Runtime: O(n Log n).  Space O(n)
     * @param arr
     * @return
     */
    public int[] window(Integer[] arr) {

        int[] bounds = {-1, -1};
        if (arr == null || arr.length <= 1) {
            return bounds;
        }
        Integer[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);

        for (int i = 0; i < arr.length; i++) {
            if (sorted[i] != arr[i] && bounds[0] == -1) {
                bounds[0] = i;
            } else if (sorted[i] != arr[i]) {
                bounds[1] = i; 
            }
        }

        return bounds;
    }

    /**
     * O(n) runtime, O(1) memory
     * @param arr
     * @return
     */
    public int[] windowOptimized(Integer[] arr) {

        int[] bounds = {-1, -1};
        int maxSeen = Integer.MIN_VALUE;
        int minSeen = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; ++i) {
            maxSeen = Math.max(maxSeen, arr[i]);
            if (arr[i] < maxSeen) {
                bounds[1] = i;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            minSeen = Math.min(minSeen, arr[i]);
            if (arr[i] > minSeen) {
                bounds[0] = i;
            }
        }

        return bounds;
    }
}
