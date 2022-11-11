import java.util.Scanner;

public class MakingIfTrainee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputName;
        System.out.println("Pick a number between 1 and 10");
        inputName = scanner.nextInt();
        if(inputName<5){
            System.out.println("Enjoy the good luck");
        } else {
            System.out.println("Your show selection will make your very happy");
        }
    }
}
