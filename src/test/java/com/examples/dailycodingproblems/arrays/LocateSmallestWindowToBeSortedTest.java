package com.examples.dailycodingproblems.arrays;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LocateSmallestWindowToBeSortedTest {
    
    @Autowired
    LocateSmallestWindowToBeSorted test;

    @Test
    void verifyFunctionality() {

        int[] window = test.window(Arrays.array(3,7,5,6,9));
        assertThat(window).containsExactly(1,3);

        window = test.windowOptimized(Arrays.array(3,7,5,6,9));
        assertThat(window).containsExactly(1,3);

    }
}
