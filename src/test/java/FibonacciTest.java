import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;


public class FibonacciTest {

    @TestFactory
    Stream<DynamicTest> should_return_correct_number_given_int() {

        List<int[]> numbers = Arrays.asList(
                new int[]{1, 1},
                new int[]{2, 1},
                new int[]{3, 2},
                new int[]{4, 3},
                new int[]{5, 3}
        );

        return numbers.stream()
                .map(arr -> dynamicTest("should_return_" + arr[1] + "_given_" + arr[0], () -> {
                    assertEquals(Fibonacci.caculate(arr[0]), arr[1]);
                }));


    }
};