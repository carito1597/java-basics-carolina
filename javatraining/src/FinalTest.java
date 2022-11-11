import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.println("Please put your final score: ");
        score = scanner.nextInt();

        if(score>70){
            System.out.println("Congratulation, you are approved");
        }else {
            System.out.println("Yor are not approved");
        }
    }
}
