package ro.serbantudor04.adapterpattern.farmacie;

public class Medicament {
    private String nume;


    public Medicament(String nume) {
        this.nume = nume;
    }

    public void cumparaMedicament(){
        System.out.println("Este cumparat medicamentul "+this.nume);


    }
}
