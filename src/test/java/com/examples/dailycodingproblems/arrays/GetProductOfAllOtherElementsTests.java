package com.examples.dailycodingproblems.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GetProductOfAllOtherElementsTests {

	@Autowired
	GetProductOfAllOtherElements gp;

	@Test
	void verifyFunctionality() {

		List<Integer> product = gp.product(Arrays.asList(3,2,1));
		assertThat(product).containsSequence(2,3,6);

		product = gp.product(Arrays.asList(1,2,3,4,5));
		assertThat(product).containsSequence(120,60,40,30,24);

		product = gp.product(Arrays.asList(5));
		assertThat(product).containsSequence(5);

		product = gp.product(Collections.emptyList());
		assertThat(product).isEmpty();

		product = gp.product(null);
		assertThat(product).isNull();
	}

}
