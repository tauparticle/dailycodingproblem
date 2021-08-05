package com.examples.dailycodingproblems.arrays;

import org.springframework.stereotype.Component;

@Component
public class MaximumSubarraySum {
    
    public long kadanes(Integer[] nums) {

        long maxEndingHere = 0;
        long maxSoFar = 0;

        for (int i : nums) {
            maxEndingHere = Math.max(i, maxEndingHere + i);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
