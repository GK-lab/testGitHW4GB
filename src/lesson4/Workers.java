package lesson4;

public class Workers {
    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    private String name;
    private String position;
    private int phoneNumber;
    private int wage;
    private int age;

    //2 Конструктор класса должен заполнять эти поля при создании объекта;

    Workers(String name,String position, int phoneNumber, int wage,int age){
        this.name=name;
        this.position=position;
        this.phoneNumber=phoneNumber;
        this.wage=wage;
        this.age=age;
    }
    String getName() {
        return name;
    }
    String getPosition() {
        return position;
    }
    int getPhone() {
        return phoneNumber;
    }
    int getWage() {
        return wage;
    }
    int getAge() {
        return age;
    }

    
}
