public class Employee {
    private int hoursWorked;
    private int hourlyPayInPln = 32;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getPayForHour() {
        return hourlyPayInPln;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayForHour(int payForHour) {
        this.hourlyPayInPln = payForHour;
    }
}
