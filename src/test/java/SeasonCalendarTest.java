import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class SeasonCalendarTest {

    @ParameterizedTest
    @EnumSource (value = Season.class, names = {"WINTER"}, mode = EnumSource.Mode.EXCLUDE)
    void shouldReturnWinter(Season season) {
        Season expectedResult = Season.WINTER;
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.JANUARY));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.FEBRUARY));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.DECEMBER));
    }

    @ParameterizedTest
    @EnumSource (value = Season.class, names = {"AUTUMN"}, mode = EnumSource.Mode.EXCLUDE)
    void shouldReturnAutumn(Season season) {
        Season expectedResult = Season.AUTUMN;
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.SEPTEMBER));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.OCTOBER));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.NOVEMBER));
    }

    @ParameterizedTest
    @EnumSource (value = Season.class, names = {"SUMMER"}, mode = EnumSource.Mode.EXCLUDE)
    void shouldReturnSummer(Season season) {
        Season expectedResult = Season.SUMMER;
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.JUNE));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.JULY));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.AUGUST));
    }

    @ParameterizedTest
    @EnumSource (value = Season.class, names = {"SPRING"}, mode = EnumSource.Mode.EXCLUDE)
    void shouldReturnSpring(Season season) {
        Season expectedResult = Season.SPRING;
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.MARCH));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.APRIL));
        Assertions.assertEquals(expectedResult,SeasonCalendar.getSeason(Month.MAY));
    }

}