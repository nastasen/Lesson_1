package Lesson_4;

public class Animal {
    String name;
    String canSwim;
    String eat;
    int food;
    int run;

    void swim() {
        System.out.println("Умеет плавать");
    }

    void eating() {
        System.out.println("Eating");
    }

    void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
