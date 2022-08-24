package com.neet.practices;

public class ValidSudoku {
    /*
    Conditions for a valid Sudoku
    1. All numbers are in the range 1-9
    2. NO duplicates on the rows / columns
    3. No duplicates on the 9 different 3*3 squares
     */

    private static final int sudokulength = 9;

    public static void main(String[] args) {
        int[][] inputSudoko = {
                {0,5,1,0,0,6,7,2,0},
                {0,2,4,0,8,9,0,0,0},
                {0,0,0,0,1,2,0,0,0},
                {0,7,0,0,3,1,0,0,0},
                {0,0,0,4,0,0,0,8,0},
                {0,8,5,0,0,0,0,0,9},
                {2,0,0,5,0,0,0,3,0},
                {0,1,0,0,9,7,4,0,0},
                {6,0,0,0,0,0,0,0,0}
        };
        isValidSudoku(inputSudoko);
    }

    private static boolean isValidSudoku(int[][] inputSudoko) {
        if(inputSudoko.length != 9){
            return false;
        }

        for (int i = 0;i < sudokulength; i++){
            if(inputSudoko.length != 9){
                return false;
            }
            for (int j=0;j< sudokulength;j++){



            }
        }
        return false;
    }


}
