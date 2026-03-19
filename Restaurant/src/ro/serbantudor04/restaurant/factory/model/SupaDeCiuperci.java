package ro.serbantudor04.restaurant.factory.model;

public class SupaDeCiuperci extends Supe{
    public SupaDeCiuperci(Number pret, String gramaj) {
        super(pret, gramaj);
    }
    @Override
    public void afisare() {
        System.out.println("Supa de ciuperci "+super.toString());
    }

}
