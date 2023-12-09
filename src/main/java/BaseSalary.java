public interface BaseSalary {
    static float getBaseSalary(int hoursWorked) {
        Employee employee = new Employee();
        employee.setHoursWorked(hoursWorked);
        return employee.getHoursWorked() * employee.hourlyPayInPln;
    }
}
