package ro.serbantudor04.builder;

public class Internare {
    protected String nume;
    protected String prenume;
    protected int varsta;

    protected Boolean feat_pat =false;
    protected Boolean feat_papuci =false;
    protected Boolean feat_mic_dejun =false;
    protected Boolean feat_halat =false;

    public Internare() {}

    @Override
    public String toString() {
        return "Internare{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", feat_pat=" + feat_pat +
                ", feat_papuci=" + feat_papuci +
                ", feat_mic_dejun=" + feat_mic_dejun +
                ", feat_halat=" + feat_halat +
                '}';
    }
}
