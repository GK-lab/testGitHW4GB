package lessonB1;

import java.util.ArrayList;
import java.util.Arrays;

public class Gener {

public static void main (String [] arg){

    //задание 1
    Object[] array = new Object[] { 1, 2, 3, 4, 5 };

    swap(array, 1, 3);
    System.out.println();

    //задание 2
    String[] arrSt = new String[]{ "one","two", "free ;)" };
    ArrayList<String> result= changeToArr(arrSt);
    System.out.print(result);

    }

    //метод задания 1
    public static void swap(Object[] array, int i,int j) {
        Object a = array[i];
        Object b = array[j];

        array[i] = b;
        array[j] = a;

        for(Object arr: array){
            System.out.print(arr);
        }
        }
    //метод задания 2
    private static <T>  ArrayList<T> changeToArr(String[] arrSt) {
        return new ArrayList (Arrays.asList(arrSt));
    }

}


