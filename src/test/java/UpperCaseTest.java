import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource (strings = {"Witam", "aBcD", "aaaa"})
    void shouldGetUpperCase(String input) {
        UpperCase upperCase = new UpperCase();
        String expectedText = UpperCase.getUpperCase(input);
        Assertions.assertEquals(shouldGetUpperCase(input), expectedText);
    }
}