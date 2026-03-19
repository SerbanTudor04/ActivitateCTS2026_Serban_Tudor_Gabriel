package ro.serbantudor04.restaurant.rezervare;

public class Cont {
    private String nume;
    private String prenume;
    private String nrCont;

    public Cont(String nume, String prenume, String nrCont) {
        this.nume = nume;
        this.prenume = prenume;
        this.nrCont = nrCont;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNrCont() {
        return nrCont;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", nrCont='" + nrCont + '\'' +
                '}';
    }
}
