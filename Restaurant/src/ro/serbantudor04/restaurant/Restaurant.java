package ro.serbantudor04.restaurant;

import ro.serbantudor04.restaurant.factory.FelDeMancareFactory;
import ro.serbantudor04.restaurant.factory.model.Papanasi;
import ro.serbantudor04.restaurant.factory.model.SupaDeCiuperci;
import ro.serbantudor04.restaurant.factory.model.TipAliment;
import ro.serbantudor04.restaurant.rezervare.Cont;
import ro.serbantudor04.restaurant.rezervare.ContRegistry;
import ro.serbantudor04.restaurant.rezervare.Rezervare;

public class Restaurant {

    public static void gateste(){
        SupaDeCiuperci ciuperci = (SupaDeCiuperci) FelDeMancareFactory.getFel(100,"100 grame", TipAliment.Supe.SUPA_DE_CIUPERCI);
        ciuperci.afisare();
        System.out.println("==========================");

        Papanasi papanasi = (Papanasi) FelDeMancareFactory.getFel(150,"532 grame", TipAliment.Desert.PANPANASI);
        papanasi.afisare();
    }

    public static void rezervari() throws CloneNotSupportedException {
        System.out.println("==========================");
        ContRegistry registey = ContRegistry.getInstance();
        for(int i=0;i<=10;i++){
            registey.add(new Cont("Nume"+i,"Prenume"+i,"CNT"+i));
        }

        registey.display();

        Cont c1= registey.get("CNT1");
        System.out.println(c1);
        Rezervare r1 = new Rezervare(c1.getNume(),2,"01-01-2026","3","0000000");
        System.out.println(r1);
        Rezervare r2 = (Rezervare) r1.clone();
        r2.setNrPersoane(3);
        r2.setOra("12:00");
        System.out.println(r2);



    }


    public static void main(String[] args) throws CloneNotSupportedException {
        gateste();
        System.out.println("==========================");

        rezervari();


    }
}
