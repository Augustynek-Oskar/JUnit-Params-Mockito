public class SalaryCalculator extends Employee implements BaseSalary, SaturdayBonus {
    public static void main(String[] args) {
        Employee employee = new Employee();
        float oneTimeBonus = 350;
        float totalSalary = BaseSalary.getBaseSalary(160) + SaturdayBonus.getSaturdaysBonus(16) + oneTimeBonus;

        System.out.println("Base salary is: " + BaseSalary.getBaseSalary(160));
        System.out.println("Saturdays bonus is: " + SaturdayBonus.getSaturdaysBonus(16));
        System.out.println("One time bonus is: " + oneTimeBonus);
        System.out.println("Total salary is: " + totalSalary);
        System.out.println(getTotalSalary(145, 8));
    }
    public static float getTotalSalary(int baseHours, int saturdayHours){
        return BaseSalary.getBaseSalary(baseHours) + SaturdayBonus.getSaturdaysBonus(saturdayHours);
    }
    public static float getTotalSalary(int baseHours, int saturdayHours, float oneTimeBonus){
        return BaseSalary.getBaseSalary(baseHours) + SaturdayBonus.getSaturdaysBonus(saturdayHours) + oneTimeBonus;
    }
}
