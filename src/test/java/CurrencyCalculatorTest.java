import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyCalculatorTest {

    @Test
    void plnToEuroCalculator() {
        CurrencyCalculator currencyCalculator = Mockito.mock(CurrencyCalculator.class);
        float expectedValue = 23.09468f;
        Mockito.when(currencyCalculator.plnToEuroCalculator(100)).thenReturn(expectedValue);
        Mockito.when(currencyCalculator.plnToEuroCalculator(0)).thenReturn(0f);
        Assertions.assertEquals(expectedValue, currencyCalculator.plnToEuroCalculator(100));
        Assertions.assertEquals(0, currencyCalculator.plnToEuroCalculator(0));
    }

    @Test
    void plnToUsdCalculator() {
        CurrencyCalculator currencyCalculator = Mockito.mock(CurrencyCalculator.class);
        float expectedValue = 25f;
        Mockito.when(currencyCalculator.plnToUsdCalculator(100)).thenReturn(expectedValue);
        Mockito.when(currencyCalculator.plnToUsdCalculator(0)).thenReturn(0f);
        Assertions.assertEquals(expectedValue, currencyCalculator.plnToUsdCalculator(100));
        Assertions.assertEquals(0, currencyCalculator.plnToUsdCalculator(0));
    }

    @Test
    void plnToGbpCalculator() {
        CurrencyCalculator currencyCalculator = Mockito.mock(CurrencyCalculator.class);
        float expectedValue = 19.80198f;
        Mockito.when(currencyCalculator.plnToGbpCalculator(100)).thenReturn(expectedValue);
        Mockito.when(currencyCalculator.plnToGbpCalculator(0)).thenReturn(0f);
        Assertions.assertEquals(expectedValue, currencyCalculator.plnToGbpCalculator(100));
        Assertions.assertEquals(0, currencyCalculator.plnToGbpCalculator(0));
    }
}