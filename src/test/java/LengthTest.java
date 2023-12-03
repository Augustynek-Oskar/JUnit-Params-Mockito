import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    private static Stream<Arguments> getTextLength(){
        return Stream.of(
                Arguments.of("jeden", "5"),
                Arguments.of("jeden dwa", "9"),
                Arguments.of("", "0")
        );
    }
    @ParameterizedTest
    @MethodSource("getTextLength")
    void shouldReturnTextLength(String input, String expected) {
        String actualValue = String.valueOf(input.length());
        Assertions.assertEquals(expected, actualValue);
    }

}