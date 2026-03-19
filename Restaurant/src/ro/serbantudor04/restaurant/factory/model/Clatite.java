package ro.serbantudor04.restaurant.factory.model;

public class Clatite extends Desert{
    public Clatite(Number calorii, String pret) {
        super(calorii, pret);
    }
    @Override
    public void afisare() {
        System.out.println("Clatite "+super.toString());
    }
}
