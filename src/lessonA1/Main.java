package lessonA1;

import lessonA1.ArrNoIntException;
import lessonA1.ArrSizeException;

public class Main {
    public static void main(String[] args) throws ArrSizeException, ArrNoIntException {
        String[][] arr =
                {
                {"6", "24", "8", "1"},
                {"7", "4", "0", "9"},
                {"6", "к", "8", "1"},
                {"1", "9", "5", "8"}
                };
        System.out.println(checkArr(arr));
    }

    public static int checkArr(String[][] arr) throws ArrSizeException, ArrNoIntException {
        if(arr.length != 4) {
            throw new ArrSizeException ("чило вышло за рамки массива");
        }
        int checker = 0;

        for(int i = 0; i< arr.length; i++) {
            if (arr[i].length != 4) {
                throw new ArrSizeException ("число вышло за рамки массива");
            }
            for(int j=0; j<arr[i].length; j++) {

                try {
                    checker+=Integer.parseInt(arr[i][j]);
                }
                catch(NumberFormatException e) {
                    throw new ArrNoIntException ("в ячейке ["+i+"]["+j+"] символ- <"+arr[i][j]+"> не является числом");
                }
            }
        }
        return checker;
    }
}
