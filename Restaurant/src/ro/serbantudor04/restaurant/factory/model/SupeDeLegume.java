package ro.serbantudor04.restaurant.factory.model;

public class SupeDeLegume extends Supe{
    public SupeDeLegume(Number pret, String gramaj) {
        super(pret, gramaj);
    }
    @Override
    public void afisare() {
        System.out.println("Supe de legume "+super.toString());
    }


}
