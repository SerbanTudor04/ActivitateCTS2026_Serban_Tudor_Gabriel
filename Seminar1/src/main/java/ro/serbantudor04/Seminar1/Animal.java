package ro.serbantudor04.Seminar1;

public abstract class Animal {
    private String name;
    private int age;
    public abstract void eat(String food);

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
