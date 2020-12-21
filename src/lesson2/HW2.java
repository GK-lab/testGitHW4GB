package lesson2;

public class HW2
{

    public static void main (String[] args) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //для задания 1
        cheNum(arr1);

        int[] arr2= new int[8]; //для задания 2
        getArr(arr2);

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//для задания 3
        dub(arr3);

        int[] arr4 = {1, 55, 3, 14, 11, 4, 71, 2, 4, 8, 9, 1};//для задания 4
        big(arr4);

    }

    //    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    //    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    //    Написать метод, заменяющий в  принятом массиве 0 на 1, 1 на 0;

    public static void cheNum (int[] arr1)
    {
        System.out.println("Задание 1");

        for (int i=0; i<arr1.length; i++)
            {

                arr1[i]= (arr1[i] > 0) ? 0 : 1;
                System.out.print(arr1[i] + " ");

            }
        System.out.println("\n");
    }

    //2 Задать пустой целочисленный массив размером 8.
    // Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;


    public static void getArr (int[] arr2)
    {
        System.out.println("Задание 2");

        for (int i=0; i<arr2.length; i++)
            {
                arr2[i]=(3*i)+1;
                System.out.print(arr2[i]+" ");
            }

        System.out.println("\n");

    }

    //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    // написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;

    public static void dub (int[] arr3)
    {
        System.out.println("Задание 3");

        for (int i=0; i<arr3.length; i++)
        {

            arr3[i]= (arr3[i] < 6) ?  arr3[i]*2 : arr3[i];
            System.out.print(arr3[i]+" ") ;

        }
        System.out.println("\n");
    }

    //4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    public static void big (int[] arr4)
    {
        System.out.println("Задание 4");

        int t=0;
        for (int i=0; i<arr4.length; i++)
        {
            t = (t < arr4[i]) ? arr4[i] : t;
        }

        System.out.println(t);
    }

}