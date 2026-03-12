package ro.serbantudor04.seminar4.hotel;

public class Hotel {
    public static Hotel instance = null;

    private String denumire;
    private int nrCamere;
    private int nrCamereInchriate;
    private int nrAngajati;

    private Hotel(){
        denumire = "Hotel Serbantudor";
        nrCamere = 100;
        nrCamereInchriate = 0;
        nrAngajati = 100;
    }

    private Hotel(String denumire, int nrCamere,  int nrAngajati){
        this.denumire = denumire;
        this.nrCamere = nrCamere;
        this.nrCamereInchriate = 0;
        this.nrAngajati = nrAngajati;
    }

    public void afisareInchiriereCamera(){

        if(nrCamereInchriate >= nrCamere){
            System.out.println("Nu exista camere disponibile!");
            return;
        }
        System.out.println("Camera a fost inchiriata cu success!");
        nrCamereInchriate++;

    }


    public void afisareDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append("Denumire: ").append(denumire).append("\n");
        sb.append("Nr camere: ").append(nrCamere).append("\n");
        sb.append("Nr angajati: ").append(nrAngajati).append("\n");
        System.out.println(sb.toString());

    }

    public static synchronized Hotel getInstance(String denumire, int nrCamere, int nrAngajati){
        if (instance == null) {
            return new Hotel(
                    denumire,
                    nrCamere,
                    nrAngajati
            );
        }
        return instance;
    }

    public static synchronized Hotel getInstance(){
        if (instance == null) {
            return new Hotel();
        }
        return instance;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public int getNrCamereInchriate() {
        return nrCamereInchriate;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }


}
