package ro.serbantudor04.restaurant.model;

public class SupaDeVita extends Supe {
    public SupaDeVita(Number pret, String gramaj) {
        super(pret, gramaj);
    }
    @Override
    public void afisare() {
        System.out.println("Supa de vita "+super.toString());
    }


}
