package ro.serbantudor04;

public class Pacient {
    public String nume;
    public int gravitate;

    public String getNume() {
        return nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }
}
