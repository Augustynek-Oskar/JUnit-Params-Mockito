public class SalaryCalculator extends Employee implements BaseSalary, SaturdayBonus {

    public static float getTotalSalary(int baseHours, int saturdayHours){
        Employee employee = new Employee();
        //base salary
        employee.setHoursWorked(baseHours);
        int baseHoursWorked = employee.getHoursWorked();
        float baseSalary = baseHoursWorked * employee.getPayForHour();

        //bonus saturdays
        employee.setHoursWorked(saturdayHours);
        employee.setPayForHour(37);
        int saturdayHoursWorked = employee.getHoursWorked();
        float saturdaysBonusSalary = saturdayHoursWorked * employee.getPayForHour();

        System.out.println(baseSalary + saturdaysBonusSalary);
        return baseSalary + saturdaysBonusSalary;
    }
    public float getTotalSalary(int baseHours, int saturdayHours, float oneTimeBonus){
        Employee employee = new Employee();
        //base salary
        employee.setHoursWorked(baseHours);
        int baseHoursWorked = employee.getHoursWorked();
        float baseSalary = baseHoursWorked * employee.getPayForHour();

        //bonus saturdays
        employee.setHoursWorked(saturdayHours);
        employee.setPayForHour(37);
        int saturdayHoursWorked = employee.getHoursWorked();
        float saturdaysBonusSalary = saturdayHoursWorked * employee.getPayForHour();

        System.out.println(baseSalary + saturdaysBonusSalary);
        return baseSalary + saturdaysBonusSalary + oneTimeBonus;
    }

    @Override
    public float getBaseSalary(int hoursWorked) {
        Employee employee = new Employee();
        employee.setHoursWorked(hoursWorked);
        return employee.getHoursWorked() * employee.getPayForHour();
    }

    @Override
    public float getSaturdaysBonus(int saturdayHours) {
        Employee employee = new Employee();
        employee.setHoursWorked(saturdayHours);
        employee.setPayForHour(38);
        return employee.getHoursWorked() * employee.getPayForHour();
    }
}
