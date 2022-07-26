package Chapter1Problems;

import java.util.Arrays;
import java.util.Locale;

public class ProblemOneFour {
    public void runProblem(){
        String testing = "ajwmnaajwmn";
        System.out.println(checkPalindromePermutation(testing));
    }

    public static boolean checkPalindromePermutation (String input){
        boolean ret = true;
        input = input.toLowerCase(Locale.ROOT);
        input = input.replaceAll("[^a-z]", "");
        char[] palPerm = input.toCharArray();
        Arrays.sort(palPerm);
        System.out.println(palPerm);

        if (palPerm.length % 2 == 0){
            for (int i = 0; i < palPerm.length - 1; i = i + 2){
                System.out.println("even, checking: " + palPerm[i]);
                if (palPerm[i] != palPerm[i + 1]) {
                    ret = false;
                    break;
                }
            }
        }
        else {
            int counter = 0;
            for (int i = 0; i < palPerm.length - 1; i = i + 2){
                System.out.println("odd, checking: " + palPerm[i]);
                if (palPerm[i] != palPerm[i + 1]) {
                    counter++;
                    i--;
                }
            }
            if (counter > 1) {
                ret = false;
            }
        }

        return ret;
    }

}
