package ro.serbantudor04.restaurant.factory.model;

public class SupaDeVita extends Supe {
    public SupaDeVita(Number pret, String gramaj) {
        super(pret, gramaj);
    }
    @Override
    public void afisare() {
        System.out.println("Supa de vita "+super.toString());
    }


}
