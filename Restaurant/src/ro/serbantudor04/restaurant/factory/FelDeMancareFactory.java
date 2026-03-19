package ro.serbantudor04.restaurant.factory;

import ro.serbantudor04.restaurant.model.*;

public class FelDeMancareFactory {
    private FelDeMancareFactory(){}
    public static FelDeMancare getFel(Number calorii, String pret, TipAliment.Desert tip){
        switch (tip){
            case PANPANASI -> {
                return new Papanasi(calorii,pret);
            }
            case CLATITE -> {
                return new Clatite(calorii,pret);
            }
            case CHEESECAKE -> {
                return new CheeseCake(calorii,pret);
            }
            default -> {
                return null;
            }
        }
    }
    public static FelDeMancare getFel(Number pret, String gramaj,TipAliment.Supe tip){
        switch (tip){
            case SUPA_DE_CIUPERCI -> {
                return new SupaDeCiuperci(pret,gramaj);
            }
            case SUPA_DE_VITA -> {
                return new SupaDeVita(pret,gramaj);
            }
            case SUPE_DE_LEGUME -> {
                return new SupeDeLegume(pret,gramaj);
            }
            default -> {
                return null;
            }
        }

    }
}
