package Chapter1Problems;

public class ProblemOneFive {
    public void runProblem(){
        //insert, remove, replace
        //one away, or zero away
        //pale , ple       true
        //pales , pale     true
        //pale , bale      true
        //pale , bake      false
        String example1 = "pale";
        String example2 = "bake";
        System.out.println(oneAwayChecker(example1, example2));
    }

    public static boolean oneAwayChecker(String input1, String input2){
        char[] first;
        char[] second;
        //assign the two input strings to character arrays, determining in the process which is larger (if either)
        //first is assigned to the larger string, second is assigned to the smaller string
        if (input1.length() > input2.length()){
            first = input1.toCharArray();
            second = input2.toCharArray();
        }
        else {
            first = input2.toCharArray();
            second = input1.toCharArray();
        }

        //check for replacement
        if (first.length == second.length){
            //check if same word, use a counter to see if the word is the same except for one char
            boolean same = true;
            int counter = 0;
            for (int i = 0; i < first.length; i++){
                counter++;
                if (first[i] != second[i]) {
                    same = false;
                    counter--;
                }
            }
            System.out.println(counter);
            if (same || first.length == counter + 1) {
                return true;
            }
        }
        //check if insert/remove (remember, 'first' is larger than 'second')
        if (Math.abs(first.length - second.length) == 1){
            boolean insertRemove = true;
            for (int i = 0; i < second.length; i++){
                if (second[i] != first[i]){
                    if (second[i] != first[i + 1]){
                        insertRemove = false;
                    }
                }
            }
            return insertRemove;
        }
        //words are 2+ chars apart
        return false;
    }

}
