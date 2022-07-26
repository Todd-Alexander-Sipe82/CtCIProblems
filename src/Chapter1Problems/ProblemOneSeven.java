package Chapter1Problems;

public class ProblemOneSeven {

    public void runProblem(){
        int n = 5;
        int[][] picture = createImage(n);
        rotateImage(picture, n);
    }

    public static int[][] createImage(int size){
        int[][] theImage = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                theImage[i][j] = i;
            }
        }
        System.out.println("Original Image created:");
        printImage(theImage, size);
        return theImage;
    }

    public static void rotateImage(int[][] input, int size){
        int[][] out = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                out[j][i] = input[i][j];
            }
        }
        System.out.println("Image rotated:");
        printImage(out, size);
    }

    public static void printImage(int[][] input, int size){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }

}
