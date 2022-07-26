package Chapter1Problems;

import java.util.Arrays;

public class ProblemOneTwo {
    public void runProblem(){
        String one = "bacaddd";
        String two = "bdaacad";
        System.out.println(compareTwoStrings(one, two));
    }

    public static boolean compareTwoStrings(String first, String second){
        if (first.length() != second.length()) {
            return false;
        }
        char[] temp1 = first.toCharArray();
        char[] temp2 = second.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        for (int i = 0; i < temp1.length; i++){
            if (temp1[i] != temp2[i]){
                return false;
            }
        }
        return true;
    }

}
