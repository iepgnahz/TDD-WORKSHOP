import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class AnagramsTest {
    @TestFactory
    Stream<DynamicTest> should_return_single_char_given_single_string() {
        return Stream.of("b", "i", "r", "o")
                .map(str -> dynamicTest("should_return_" + str + "_given_" + str, () -> {
                    List<String> actualList = Anagrams.calculate(str);
                    List<String> expectedList = Arrays.asList(str);
                    assertThat(actualList).isEqualTo(expectedList);
                }));
    }

    @TestFactory
    Stream<DynamicTest> should_return_list_given_string_with_two_char() {
        return Stream.of("bi", "br", "bo", "ir", "io", "ro")
                .map(str -> dynamicTest("should_return_list_with_two_element_given_" + str, () -> {
                    List<String> actualList = Anagrams.calculate(str);
                    assertThat(actualList).contains(str);
                    assertThat(actualList.size()).isEqualTo(2);
                }));
    }

    @TestFactory
    Stream<DynamicTest> should_return_list_given_string_with_three_char() {
        return Stream.of("bir")
                .map(str -> dynamicTest("should_return_list_with_two_element_given_" + str, () -> {
                    List<String> actualList = Anagrams.calculate(str);
                    assertThat(actualList).contains(str);
                    assertThat(actualList.size()).isEqualTo(6);
                }));
    }

    @TestFactory
    Stream<DynamicTest> should_return_list_given_string_with_four_char() {
        return Stream.of("biro")
                .map(str -> dynamicTest("should_return_list_with_two_element_given_" + str, () -> {
                    List<String> actualList = Anagrams.calculate(str);
                    assertThat(actualList).contains(str);
                    System.out.println(actualList);
                    assertThat(actualList.size()).isEqualTo(24);
                }));
    }


}
