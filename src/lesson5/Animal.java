package lesson5;

public class Animal {

    protected String name;
    protected int distance;
    protected double height;
    protected int pool;

    public Animal(String name, int distance, double height, int pool){

        this.name=name;
        this.distance=distance;
        this.height=height;
        this.pool=pool;
    }

    void run(){
        System.out.println(name + " has run " + distance);
    }

    void swim(){
        System.out.println(name + " has swim " + pool);
    }

    void jump(){
        System.out.println(name + " has jump " + height);
    }
}
