public class Employee {
    int hoursWorked;
    int hourlyPayInPln = 32;

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
