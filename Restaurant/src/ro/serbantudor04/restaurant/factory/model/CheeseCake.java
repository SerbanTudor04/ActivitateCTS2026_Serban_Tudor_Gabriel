package ro.serbantudor04.restaurant.factory.model;

public class CheeseCake extends Desert{
    public CheeseCake(Number calorii, String pret) {
        super(calorii, pret);
    }
    @Override
    public void afisare() {
        System.out.println("Cheese Cake "+super.toString());
    }
}
