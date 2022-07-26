package Chapter1Problems;

public class ProblemOneOne {

    public void runProblem(){
        System.out.println(determineUniqueLetters("abcdefghijklmnop"));
    }

    public static boolean determineUniqueLetters(String input){
        for (int i = 0; i < input.length() - 1; i++){
            for (int j = i + 1; j < input.length(); j++){
                if (input.charAt(i) == input.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

}
