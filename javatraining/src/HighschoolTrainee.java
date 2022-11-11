import java.util.Scanner;

public class HighschoolTrainee {
        public static void main(String[] args) {
            int age = 25;
            double prom = 15.0;

            String firstName = "Carolina";
            String lastName = "Villalobos";
            char firstInitial = firstName.charAt(0);
            char lastInitial = lastName.charAt(0);
            boolean attendance = true;

            String studentName = firstName+" "+lastName;

            System.out.println("The student name is " + studentName);
            System.out.println("The first name is " + firstName);
            System.out.println("The last name is " + lastName);
            System.out.println("The student age is " + age);
            System.out.println("The prom is " + prom);
            System.out.println("The first initial is " + firstInitial);
            System.out.println("The last initial is " + lastInitial);
            System.out.println("The attendance is " + attendance);

            System.out.println("The student prom are " + prom + ". Please modify this prom");

            Scanner input = new Scanner(System.in);
            prom = input.nextDouble();

            System.out.println("The new prom are " + prom);

            System.out.println("The last name is " + lastName + ". Please modify this prom: ");
            lastName = input.nextLine();
            System.out.println("The new last name is " + lastName);
        }
}
