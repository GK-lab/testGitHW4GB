package lesson5;

public class Cat extends Animal{
    public Cat (String name, int distance, double height, int pool){
        super(name,distance, height, pool);}

        @Override
    void swim(){
        System.out.println(name + " don't swim" );
    }

}
