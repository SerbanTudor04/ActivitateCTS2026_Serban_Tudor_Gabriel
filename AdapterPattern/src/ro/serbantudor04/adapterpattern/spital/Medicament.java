package ro.serbantudor04.adapterpattern.spital;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        if(!this.prezintaReteta()) {
            System.out.println("Pentru medicamentul cu numele "+this.nume+" nu exista reteta");
            return;
        }

        System.out.println("Achizitioneaza medicamentul "+this.nume +" cu pretul "+this.pret);

    }


    public String getNume() {
        return nume;
    }


    public boolean prezintaReteta(){
        return nume.toLowerCase().contains("reteta");
    }
}
