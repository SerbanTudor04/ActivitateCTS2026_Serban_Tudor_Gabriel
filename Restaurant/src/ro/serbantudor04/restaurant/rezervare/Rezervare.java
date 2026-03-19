package ro.serbantudor04.restaurant.rezervare;

public class Rezervare implements PrototypeRezervare{
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;
    protected String nrTelefon;


    public Rezervare(String numeClient, int nrPersoane, String data, String ora, String nrTelefon) {
        if(numeClient.isEmpty() || numeClient.length()>60)
            throw new IllegalArgumentException("Numele clientului nu este valid");
        this.numeClient = numeClient;


        this.nrPersoane = 1;
        if (nrPersoane < 1 || nrPersoane > 10)
            this.nrPersoane = nrPersoane;

        this.data = data;
        this.ora = ora;
        this.nrTelefon = nrTelefon;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                '}';
    }
}
