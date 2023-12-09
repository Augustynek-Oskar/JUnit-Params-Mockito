public class SalaryCalculator extends Employee implements BaseSalary, SaturdayBonus {

    @Override
    public float getBaseSalary(int hoursWorked) {
        Employee employee = new Employee();
        employee.hoursWorked = hoursWorked;
        return employee.hoursWorked * employee.hourlyPayInPln;
    }
}
