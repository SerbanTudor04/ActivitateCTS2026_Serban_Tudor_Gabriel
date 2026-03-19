package ro.serbantudor04.restaurant.factory.model;

public abstract class Supe  implements FelDeMancare{
    protected Number pret;
    protected String gramaj;

    public Supe(Number pret, String gramaj){
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        return "Supe{" +
                "pret=" + pret +
                ", gramaj='" + gramaj + '\'' +
                '}';
    }
}
