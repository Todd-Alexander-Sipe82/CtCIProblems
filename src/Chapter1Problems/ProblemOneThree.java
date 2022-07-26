package Chapter1Problems;

public class ProblemOneThree {
    public void runProblem(){
        String testing = "Mr John Smith      ";
        int trueLength = 13;
        System.out.println(convertSpacesToStuff(testing, trueLength));
    }

    public static String convertSpacesToStuff(String inputString, int trueLength){
        char[] conversion = inputString.toCharArray();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < trueLength; i++){
            if (conversion[i] != ' '){
                ret.append(conversion[i]);
            }
            else {
                ret.append("%20");
            }
        }
        return ret.toString();
    }

}
