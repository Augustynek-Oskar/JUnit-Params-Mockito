import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TrainingEvaluationTest {

    @ParameterizedTest
    @CsvSource (value = {"29:1" ,"30:2" ,"31:2" ,"60:2" ,"61:3", "0:0"}, delimiter = ':')
    void shouldReturnLengthRating(String input, String expected) {
        int actualValue = TrainingEvaluation.lengthRating(Integer.parseInt(input));
        Assertions.assertEquals(Integer.parseInt(expected), actualValue);
    }

    @ParameterizedTest
    @CsvSource (value = {"100:2", "300:2", "301:4", "399:4", "400:6", "0:0"}, delimiter = ':')
    void shouldReturnBurnedKcalRating(String input, String expected) {
        int actualValue = TrainingEvaluation.burnedKcalRating(Integer.parseInt(input));
        Assertions.assertEquals(Integer.parseInt(expected), actualValue);
    }

    @ParameterizedTest
    @CsvSource (value = {"176:3", "160:6", "175:6", "165:6", "159:9"}, delimiter = ':')
    void shouldReturnBpmRating(String input, String expected) {
        int actualValue = TrainingEvaluation.bpmRating(Integer.parseInt(input));
        Assertions.assertEquals(Integer.parseInt(expected), actualValue);
    }

    @ParameterizedTest
    @CsvSource (value = {}, delimiter = ':')
    void overallRating(String length, String burnedKcal, String bpm, String expected) {

    }

    @ParameterizedTest
    void trainingEfficiency() {
    }
}