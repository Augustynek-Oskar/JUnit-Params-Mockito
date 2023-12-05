import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseTest {
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource (strings = {"Witam123", "aBcD", "aaaa"})
    void shouldGetUpperCase(String input) {
        String actualText = UpperCase.getUpperCase(input);
        Assertions.assertEquals(UpperCase.getUpperCase(input), actualText);
    }
}