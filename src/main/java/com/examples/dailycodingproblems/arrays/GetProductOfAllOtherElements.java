package com.examples.dailycodingproblems.arrays;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GetProductOfAllOtherElements {
    
    /**
     * Division is not allowed here
     * input is [3,2,1] expected output would be [2,3,6]
     * @param arr
     * @return
     */
    public List<Integer> product(List<Integer> arr) {
        if (arr == null || arr.size() <= 1) {
            return arr;
        }
        List<Integer> rightProduct = new ArrayList<>();
        List<Integer> leftProduct = new ArrayList<>();
        List<Integer> results = new ArrayList<>();

        rightProduct = initValues(rightProduct, arr.size(), 1);
        leftProduct = initValues(leftProduct, arr.size(), 1);

        // [1, 1*3, 1*3*2]
        for (int i = 1; i < arr.size(); i++) {
            rightProduct.set(i, rightProduct.get(i-1) * arr.get(i-1));
        }

        // [1*1*2, 1*1, 1]
        for (int i = arr.size()-2; i >= 0; i--) {
            leftProduct.set(i, leftProduct.get(i+1) * arr.get(i+1));
        }

        for (int i = 0; i < arr.size(); i++) {
            results.add(rightProduct.get(i) * leftProduct.get(i));
        }


        return results;
    }

    private List<Integer> initValues(List<Integer> arr, int size, int value) {
        for (int i = 0; i < size; i++) {
            arr.add(value);
        }
        return arr;
    }
}
