package ro.serbantudor04.builder;

public class Internare implements Cloneable{
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

    @Override
    public Internare clone() {
        try {
            Internare clone = (Internare) super.clone();
            clone.feat_pat = this.feat_pat;
            clone.feat_papuci = this.feat_papuci;
            clone.feat_mic_dejun = this.feat_mic_dejun;
            clone.feat_halat = this.feat_halat;
            clone.nume = this.nume;
            clone.prenume = this.prenume;
            clone.varsta = this.varsta;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
