package lesson4;

public class Main {

    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//2 Конструктор класса должен заполнять эти поля при создании объекта;
//3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//4 Вывести при помощи методов из пункта 3 ФИО и должность.
//5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
//7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.

    public static void main(String[] args) {

        Workers worker1 = new Workers
                ("Бородин Алерий Иванович", "Инженер", 93025820, 30000, 40);


// 4.	Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println( worker1.getName() + "_" + worker1.getPosition());
        System.out.println();

//5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        Workers[] arrWorkers = {
                new Workers
                        ("Иванов Анатолий Алексеевич", "Слесарь", 9837203, 7000, 50),
                new Workers
                ("Алекандрова Анита Сергеевна", "Секретарь", 69483903, 15000, 25),
                new Workers
                ("Антонов Аркадий Леонидович", "Стажер", 903005403, 5000, 20),
                new Workers
                ("Аксенова Агафья Александрована", "Бухгалтер", 47589384, 25000, 45),
                new Workers
                ("Филатов Антон Петрович", "Директор", 839030094, 60000, 43)};

        for (int i = 0; i < arrWorkers.length; i++)
            if (arrWorkers[i].getAge() > 40) {
                System.out.println(arrWorkers[i].getName()+ "_" + arrWorkers[i].getPosition()
                        + "_" + arrWorkers[i].getPhone() + "_" + arrWorkers[i].getWage()
                        + "_" + arrWorkers[i].getAge());
            } else {
                System.out.println("Старше 40 лет нет");
            }

       }

    }

