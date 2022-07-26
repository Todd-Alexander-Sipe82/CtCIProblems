package Chapter1Problems;

public class ProblemOneSix {
    public void runProblem(){
        String example = "aaaaaabccccca";
        System.out.println(compressString(example));
    }

    public static String compressString(String input){
        int originalLength = input.length();
        char[] compress = input.toCharArray();
        StringBuilder out = new StringBuilder();
        int count = 1;
        char current; //placeholder character
        for (int i = 0; i < compress.length - 1; i++){
            current = compress[i];
            if (compress[i] == compress[i + 1]){
                count++;
            }
            if (current != compress[i + 1]){
                out.append(compress[i]);
                out.append(count);
                count = 1;
            }
        }
        current = compress[originalLength - 1];
        out.append(current);
        out.append(count);
        if (out.toString().length() > originalLength){
            return input;
        }
        return out.toString();
    }

}
