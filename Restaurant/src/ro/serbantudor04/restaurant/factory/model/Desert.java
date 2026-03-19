package ro.serbantudor04.restaurant.factory.model;

public abstract class Desert implements FelDeMancare {
    protected Number calorii;
    protected String pret;

    public Desert(Number calorii, String pret){
        this.calorii = calorii;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "calorii=" + calorii +
                ", pret='" + pret + '\'' +
                '}';
    }
}
