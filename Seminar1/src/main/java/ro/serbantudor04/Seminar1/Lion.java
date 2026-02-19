package ro.serbantudor04.Seminar1;

public class Lion extends Animal{
    @Override
    public void eat(String food) {
        System.out.println("The lion eats"+" "+food);
    }

    public Lion(int age, String name) {
        super(age, name);
    }
}
