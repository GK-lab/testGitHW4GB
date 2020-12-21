package lesson2;

public class lesson2 {
//  public class Hello {
//    public static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int a = scanner.nextInt();
//        float b = scanner.nextFloat();
//        String msg = scanner.nextLine();
//        System.out.println("Your number: " + msg);


//        int a = 10;
//        int b = 20;
//        int c;

//        if (a > b) {
//            c = a;
//        } else {
//            c = b;
//        }
//        c = (a > b) ? a : b;
//
//        System.out.println("Result " + c);

//        if (name == "Boris") {
//            System.out.println("Send letter Boris");
//        } else if (name == "Alex") {
//            System.out.println("Send letter Alex");
//        } else if (name == "Olga") {
//            System.out.println("Send letter Olga");
//        } else {
//            System.out.println("go out office");
//        }
//
//        String name = "123";
//
//        switch (name) {
//            case "Alex":
//                System.out.println("Send letter Alex");
//                break;
//            case "Boris":
//                System.out.println("Send letter Boris");
//                break;
//            case "Olga":
//                System.out.println("Send letter Olga");
//                break;
//            default:
//                System.out.println("go out office");
//                break;
//        }

//        {
//            int abc = 5;
//            System.out.println(abc);
//        }

        // x = x + 1 <=> x++; <=> ++x;
        // x += 2 <=> x = x + 2 | *,/,-, %

//        int j = 0;
//        System.out.println("j= " + (j++));
//        System.out.println("j= " + (++j));
//        System.out.println("j= " + j);

//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        System.out.println(mathPower(2, 10));

//        int a1 = 21;
//        int b1 = 0;
//
//        while (a1 < 20) {
//            a1++;
//            if (a1 == 15 || a1 == 17) continue;
//            System.out.print("a1=" + a1 + " ");
//        }
//
//        System.out.println();
//
//        do {
//            b1++;
//            if (b1 == 6) {
//                break;
//            }
//            System.out.print("b1=" + b1 + " ");
//        } while (b1 < 10);
//
//    }
//
//    public static int mathPower(int base, int signature) {
//        int result = 1;
//        for (int i = 0; i < signature; i++) {
//            result *= base;
//        }
//        return result;

//        int[] arrayInt = new int[10];

//        for (int i = 0; i < arrayInt.length; i++) {
//            arrayInt[i] = i;
//        }

//        writeArray(arrayInt);
////        readArray(arrayInt);
//
//        System.out.println(Arrays.toString(arrayInt));

//        int[][][] arrayInt2 = new int[5][][];
//        arrayInt2[0] = new int[6][];
//        arrayInt2[1] = new int[8][];
//        arrayInt2[2] = new int[100][];
//        System.out.println(arrayInt2.length);
//        System.out.println(arrayInt2[0].length);
//        arrayInt2[0][0] = new int[10];
//
//        int[][] arr = {{5, 2}, {25, 50}};
//        int[][] arr1 = new int[2][2];
//        arr1[0][0] = 5;


//        arrayInt[0] = 105;
//        arrayInt[1] = 1000;
//        arrayInt[2] = 500;
//
//        boolean[] arrayB = new boolean[2];
//        System.out.println(arrayB[0]);
//
//        System.out.println("Address: " + arrayInt);
//        System.out.println(arrayInt[2]);
//        arrayInt[2] = 15000;
//        System.out.println(arrayInt[2]);
//
//
//        String[] array23 = {"Boris", "Olga", "Alex"};
//        int[] arr1 = {1, 2, 3, 5};
//
//        tablePifagor(10, 10);
//
//        int[][] array = new int[5][6];
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//
//            }
//        }
//    }


//    public static void readArray(int[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " ");
//        }
//    }
//
//    public static void writeArray(int[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = i;
//        }
//    }

//    public static void tablePifagor(int width, int height) {
//        for (int y = 1; y < height; y++) {
//            for (int x = 1; x < width; x++) {
//                System.out.print(x * y + "\t");
//            }
//            System.out.println();
//        }
//    }

//1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в  принятом массиве 0 на 1, 1 на 0;
//2 Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
//3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
//4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
//5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
//6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
//    checkBalance([1, 1, 1, || 2, 1]) → true,
//    checkBalance ([2, 1, 1, 2, 1]) → false,
//    checkBalance ([10, || 1, 2, 3, 4]) → true.
//    Абстрактная граница показана символами ||, эти символы в массив не входят.
//            7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
//            [1,2,3,4,5], -2 => [3,4,5,1,2]
//            [1,2,3,4,5], 2 => [4,5,1,2,3]
//            8 **** Не пользоваться вспомогательным массивом при решении задачи 7.

    }



