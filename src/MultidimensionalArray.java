import java.util.Arrays;

public class MultidimensionalArray {
    public static void main (String[] args) {
        //To create a two-dimensional array, add each array within its own set of curly braces
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(Arrays.deepToString(myNumbers));
        System.out.println(myNumbers[1][2]);
        //You can also change the value of an element:
//        myNumbers[1][2] = 9;
//        System.out.println(myNumbers[1][2]);
        //Loop Through a Multi-Dimensional Array
        //for loop
        for (int i = 0; i < myNumbers.length; ++i) { //myNumbers.length = 2
            // 0 < 1(true), 1 < 1 (false)
            for (int j = 0; j < myNumbers[1].length; ++j) { // myNumbers[1].length = 3, 0 true, 1 true, 2 true, 3 false.
                System.out.println(myNumbers[i][j]); //1, 2, 3
            }
        }
        //for each
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }

    }
}
