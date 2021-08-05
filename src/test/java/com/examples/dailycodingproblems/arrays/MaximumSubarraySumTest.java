package com.examples.dailycodingproblems.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MaximumSubarraySumTest {
    
    @Autowired
    MaximumSubarraySum test;

    @Test
    void verifyFunctionality() {

        Integer[] nums = Arrays.array(34,-50,42,14,-5,86);
        assertThat(test.kadanes(nums)).isEqualTo(137);

        nums = Arrays.array(-5,-1,-8,-9);
        assertThat(test.kadanes(nums)).isEqualTo(0);
    }
}
