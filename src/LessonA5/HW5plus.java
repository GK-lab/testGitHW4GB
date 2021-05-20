package LessonA5;

//    Отличие первого метода от второго:
//    Первый просто бежит по массиву и вычисляет значения.
//    Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
//


public class HW5plus {
    static final int size = 10000000;
    static final int h = size / 2;



    public static void main (String [] args){
        float[] arr = new float[size];
        for(int i=0; i<size; i++)
        { arr[i]=1; }
        method2(arr);
    }
    public static void method (float [] arr){
        for(int i=0; i< arr.length; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    public static void method2(float [] arr){
    float[] a1=new float[h];
    float[] a2=new float[h];

        //Пример деления одного массива на два:
        //System.arraycopy(arr, 0, a1, 0, h);
        //System.arraycopy(arr, h, a2, 0, h);
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        long a = System.currentTimeMillis();
        System.currentTimeMillis();

        Thread first = new Thread(() -> method(a1));
        first.start();
        Thread second = new Thread(() -> method(a2));
        second.start();

//    Пример обратной склейки:
//            System.arraycopy(a1, 0, arr, 0, h);
//System.arraycopy(a2, 0, arr, h, h);

        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);
    }




//
//    Примечание:
//            System.arraycopy() копирует данные из одного массива в другой:
//            System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
//    По замерам времени:
//    Для первого метода надо считать время только на цикл расчета:
//            for (int i = 0; i < size; i++) {
//        arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//    }
//    Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.





}
