import java.util.Scanner;

public class admission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("what is your SAT score? ");
        int sat = scanner.nextInt();
        String satRating = "";
        if (sat < 1200){
            satRating = "nope";
        }else if (sat < 1400){
            satRating = "acceptable";
        }else if (sat < 1500){
            satRating = "solid";
        }else if (sat > 1500){
            satRating = "elite";
        }
        System.out.println("Your SAT rating is "+satRating);

        System.out.print("what is your percentile (don't add the % sign)? ");
        int percentile = scanner.nextInt();

        System.out.print("How many awards have you won? ");
        int awards = scanner.nextInt();

        System.out.print("what state do you live in? ");
        String state = scanner.next();
    }
}