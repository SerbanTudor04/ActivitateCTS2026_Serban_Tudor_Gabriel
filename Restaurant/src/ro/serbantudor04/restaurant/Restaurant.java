package ro.serbantudor04.restaurant;

import ro.serbantudor04.restaurant.factory.FelDeMancareFactory;
import ro.serbantudor04.restaurant.factory.model.Papanasi;
import ro.serbantudor04.restaurant.factory.model.SupaDeCiuperci;
import ro.serbantudor04.restaurant.factory.model.TipAliment;

public class Restaurant {

    public static void gateste(){
        SupaDeCiuperci ciuperci = (SupaDeCiuperci) FelDeMancareFactory.getFel(100,"100 grame", TipAliment.Supe.SUPA_DE_CIUPERCI);
        ciuperci.afisare();
        System.out.println("==========================");

        Papanasi papanasi = (Papanasi) FelDeMancareFactory.getFel(150,"532 grame", TipAliment.Desert.PANPANASI);
        papanasi.afisare();
    }




    public static void main(String[] args) {
        gateste();
        System.out.println("==========================");



    }
}
