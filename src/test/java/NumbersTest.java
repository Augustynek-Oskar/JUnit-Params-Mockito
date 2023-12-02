import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersTest {

    @ParameterizedTest
    @DisplayName("Should return true if number is divisible by two")
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void shouldReturnTrue(int input) {
        Numbers numbers = new Numbers();
        Assertions.assertTrue(numbers.checkIfNumbersIsDivisibleByTwo(input));
    }
    @ParameterizedTest
    @DisplayName("Should return false if number is zero or not divisible by two")
    @ValueSource(ints = {0, 3, 7, -7})
    void shouldReturnFalse(int input) {
        Numbers numbers = new Numbers();
        Assertions.assertFalse(numbers.checkIfNumbersIsDivisibleByTwo(input));
    }
}