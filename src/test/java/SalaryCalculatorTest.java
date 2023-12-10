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
        SalaryCalculator salaryCalculatorMock = Mockito.mock(SalaryCalculator.class);
        float expectedValue = 5120f;
        Mockito.when(salaryCalculatorMock.getBaseSalary(160)).thenReturn(expectedValue);
        Assertions.assertEquals(expectedValue, salaryCalculatorMock.getBaseSalary(160));
    }

    @Test
    @DisplayName("Should calculate bonus salary from working saturdays")
    void getSaturdayBonus() {
        SalaryCalculator salaryCalculatorMock = Mockito.mock(SalaryCalculator.class);
        float expectedValue = 608;
        Mockito.when(salaryCalculatorMock.getSaturdaysBonus(16)).thenReturn(expectedValue);
        Assertions.assertEquals(expectedValue, salaryCalculatorMock.getSaturdaysBonus(16));
    }


    @Test
    @DisplayName("Should calculate total salary without one time bonus")
    void getTotalSalary() {
        SalaryCalculator salaryCalculatorMock = Mockito.mock(SalaryCalculator.class);
        float expectedValue = 5728;
        Mockito.when(salaryCalculatorMock.getTotalSalary(160,16)).thenReturn(expectedValue);
        Assertions.assertEquals(expectedValue, salaryCalculatorMock.getTotalSalary(160, 16));
    }

    @Test
    @DisplayName("Should calculate total salary with one time bonus")
    void getTotalSalaryWithBonus() {
        SalaryCalculator salaryCalculatorMock = Mockito.mock(SalaryCalculator.class);
        float expectedValue = 6078;
        Mockito.when(salaryCalculatorMock.getTotalSalary(160,16, 350)).thenReturn(expectedValue);
        Assertions.assertEquals(expectedValue, salaryCalculatorMock.getTotalSalary(160, 16, 350));
    }
}