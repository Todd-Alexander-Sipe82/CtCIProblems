import Chapter1Problems.*;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome. Please enter a problem number in the format: xx.xx");
        System.out.println("Enter 'q' to exit.");
        Scanner sc = new Scanner(System.in);
        boolean exitCondition = false;
        while (!exitCondition){
            String input = sc.nextLine();
            exitCondition = selectProblem(input);
        }
        System.out.println("Exiting.");
    }

    public static boolean selectProblem(String input){
        if (Objects.equals(input, "q")){
            return true;
        }
        System.out.println("You have selected problem: " + input + ".");
        System.out.println("Output for problem " + input + ":");
        switch (input){
            case "1.1" -> {
                ProblemOneOne oneOne = new ProblemOneOne();
                oneOne.runProblem();
            }
            case "1.2" -> {
                ProblemOneTwo oneTwo = new ProblemOneTwo();
                oneTwo.runProblem();
            }
            case "1.3" -> {
                ProblemOneThree oneThree = new ProblemOneThree();
                oneThree.runProblem();
            }
            case "1.4" -> {
                ProblemOneFour oneFour = new ProblemOneFour();
                oneFour.runProblem();
            }
            case "1.5" -> {
                ProblemOneFive oneFive = new ProblemOneFive();
                oneFive.runProblem();
            }
            case "1.6" -> {
                ProblemOneSix oneSix = new ProblemOneSix();
                oneSix.runProblem();
            }
            case "1.7" -> {
                ProblemOneSeven oneSeven = new ProblemOneSeven();
                oneSeven.runProblem();
            }
            case "1.8" -> {
                ProblemOneEight oneEight = new ProblemOneEight();
                oneEight.runProblem();
            }
            case "1.9" -> {
                ProblemOneNine oneNine = new ProblemOneNine();
                oneNine.runProblem();
            }
            default -> System.out.println("Incorrect format. Example of proper format: 1.2");
        }
        return false;
    }

}