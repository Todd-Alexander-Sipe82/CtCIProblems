package Chapter1Problems;

public class ProblemOneNine {

    public void runProblem(){
        //check if two is a rotation of one, with only one call to isSubstring
        String one = "waterbottle";
        String two = "erbottlewat";
        System.out.println(isRotation(one, two));
    }

    public static boolean isRotation( String first, String second){
        first = first + first;
        return isSubstring(first, second);
    }

    public static boolean isSubstring(String first, String second){
        boolean ret = true;
        for (int i = 0; i < first.length(); i++) {
            if (second.charAt(0) == first.charAt(i)){
                for (int j = 0; j < second.length(); j++) {
                    if (second.charAt(j) != first.charAt(i + j)){
                        ret = false;
                    }
                }
                return ret;
            }
        }
        return true;
    }

}
