import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hoursPerWeek;
        int moneyPerHour;
        int weeksPerYear = 52;

        System.out.println("Please put hours that work per week: ");
        hoursPerWeek = sc.nextInt();
        System.out.println("Please put money maker per hour: ");
        moneyPerHour = sc.nextInt();

        System.out.println("The employee's gross yearly salary is " + (hoursPerWeek*moneyPerHour*weeksPerYear));
    }


}
