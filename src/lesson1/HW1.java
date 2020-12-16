package lesson1;

public class HW1 {


public static void main (String[] args){

    int a = 7; // для задания 1
    int b = 4;
    int c = 10;
    int d = 3;
    float result= doResult(a,b,c,d);
    System.out.println(result);

    int v1 = 13; // для задания 2
    int v2 = 5;
    boolean between = doBool(v1,v2);
    System.out.println("Между 10 и 20:" +between);

    int p=-11;    // для задания 3
    plusOrMinus(p);

    String name= "Андрей"; // для задания 4
    Hello(name); 
}


    /**
     1) Написать метод вычисляющий выражение a * (b + (c / d))
     и возвращающий результат с плавающей точкой, где a, b, c, d –
     целочисленные входные параметры этого метода;
     */
    public static float doResult(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }



    /**
     * 2) Написать метод, принимающий на вход два целых числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */
    public static boolean doBool(int v1, int v2 )
    {
        int v= v1+v2;
        boolean between;

        if (v>=20 && v<=10)
        {
            between = true;
        }
        else
        {
            between=false;
        }

        return between;
    }




/**
 * 3) Написать метод, которому в качестве параметра передается целое число,
 метод должен проверить положительное ли число передали, или отрицательное.
 Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
 */
public static void plusOrMinus (int inputValue )
{
    if (inputValue<0)
    {
       System.out.println("Число меньше нуля");
    }
    else
        {
            System.out.println("Число больше или равно нулю");
        }
}



/**
 4) Написать метод, которому в качестве параметра передается строка,
 обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
         Вывести приветствие в консоль.
 */
public static void Hello (String inputName)
{
    System.out.println("Привет, " + inputName);
}

}


