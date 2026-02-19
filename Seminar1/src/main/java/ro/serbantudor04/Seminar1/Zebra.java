package ro.serbantudor04.Seminar1;

public class Zebra extends Animal{

    @Override
    public void eat(String food) {
        System.out.println("The zebra eats"+" "+food);
    }

    public Zebra(int age, String name) {
        super(age, name);
    }
}
