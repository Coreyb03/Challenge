import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class admission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your last name");
        String name = scanner.next();

        System.out.print("what is your SAT score? ");
        int sat = scanner.nextInt();
        String satRating = "";
        if (sat < 1200){
            satRating = "nope";
        }else if (sat < 1400){
            satRating = "acceptable";
        }else if (sat < 1500){
            satRating = "solid";
        }else if (sat <= 1600){
            satRating = "elite";
        }
        System.out.println("Your SAT rating is "+satRating);

        System.out.print("what is your percentile (don't add the % sign)? ");
        int percentile = scanner.nextInt();
        String percentileRating = "";
        if (percentile < 85){
            percentileRating = "nope";
        }else if (percentile < 90){
            percentileRating = "acceptable";
        }else if (percentile < 95){
            percentileRating = "solid";
        }else if (percentile <= 100){
            percentileRating = "elite";
        }
        System.out.println("Your percentile rating is "+percentileRating);

        System.out.print("How many awards have you won? ");
        int awards = scanner.nextInt();
        String awardRating = "";
        if (awards < 3){
            awardRating = "nope";
        }else if (awards < 7){
            awardRating = "acceptable";
        }else if (awards < 9){
            awardRating = "solid";
        }else if (awards >= 9){
            awardRating = "elite";
        }
        System.out.println("Your award rating is "+awardRating);

        System.out.print("what state do you live in? ");
        String state = scanner.next();
        String stateRating = "";
        if (state.equals("Colorado")){
            stateRating = "elite";
        }else if (state.equals("Florida")){
            stateRating = "nope";
        }else {
            stateRating = "acceptable";
        }
        System.out.println("Your state rating is "+stateRating);

        String accepted = "";
        if (satRating.equals("elite")||stateRating.equals("elite")||percentileRating.equals("elite")||awardRating.equals("elite")){
            accepted = "Congratulations, you were accepted because you were elite";
        } else if (satRating.equals("solid") && percentileRating.equals("solid")||satRating.equals("solid")&&awardRating.equals("solid")||awardRating.equals("solid")&&percentileRating.equals("solid")){
            accepted = "Congratulations, you were accepted because you were solid";
        } else if (name.equals("Padjen")){
            accepted = "Congratulations, you made it in because of your name";
        } else if (satRating.equals("nope")||percentileRating.equals("nope")||awardRating.equals("nope")||stateRating.equals("nope")){
            accepted = "sorry you didn't get in because you had a poor rating";
        } else {
            accepted = "sorry you didn't get in";
        }
        System.out.println(name +" "+ accepted);

    }
}