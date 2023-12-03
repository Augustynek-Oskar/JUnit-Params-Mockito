import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {
    @ParameterizedTest
    @ValueSource (strings = {"Witam123", "aBcD", "aaaa"})
    void shouldGetUpperCase(String input) {
        String actualText = UpperCase.getUpperCase(input);
        Assertions.assertEquals(input.toUpperCase(), actualText);
    }
    @ParameterizedTest
    @NullSource
    void shouldThrowNullPointerException(String input) {
        Assertions.assertThrows(NullPointerException.class, () -> UpperCase.getUpperCase(null) );
    }
    @ParameterizedTest
    @EmptySource
    void shouldThrowRuntimeException(String input) {
        Assertions.assertThrows(RuntimeException.class, () -> UpperCase.getUpperCase("") );
    }
}