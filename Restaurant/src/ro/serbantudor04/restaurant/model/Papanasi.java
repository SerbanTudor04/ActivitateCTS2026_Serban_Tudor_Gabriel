package ro.serbantudor04.restaurant.model;

public class Papanasi extends Desert{
    public Papanasi(Number calorii, String pret) {
        super(calorii, pret);
    }
    @Override
    public void afisare() {
        System.out.println("Papanasi "+super.toString());
    }

}
