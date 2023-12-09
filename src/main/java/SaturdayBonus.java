public interface SaturdayBonus {
    static float getSaturdaysBonus(int saturdayHours){
        Employee employee = new Employee();
        employee.setHoursWorked(saturdayHours);
        employee.setPayForHour(38);
        return employee.getHoursWorked() * employee.getPayForHour();
    }
}
