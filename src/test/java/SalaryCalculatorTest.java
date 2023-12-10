import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    @Test
    @DisplayName("Should calculate base salary")
    void getBaseSalary() {
        SalaryCalculator salaryCalculator = Mockito.mock(SalaryCalculator.class);
        float expectedValue = 5120f;
        Mockito.when(salaryCalculator.getBaseSalary(160)).thenReturn(expectedValue);
        Assertions.assertEquals(expectedValue, salaryCalculator.getBaseSalary(160));
    }

    @Test
    @DisplayName("Should calculate bonus salary from working saturdays")
    void getSaturdayBonus() {
        SalaryCalculator salaryCalculator = Mockito.mock(SalaryCalculator.class);
        float expectedValue = 608;
        Mockito.when(salaryCalculator.getSaturdaysBonus(16)).thenReturn(expectedValue);
        Assertions.assertEquals(expectedValue, salaryCalculator.getSaturdaysBonus(16));
    }
}