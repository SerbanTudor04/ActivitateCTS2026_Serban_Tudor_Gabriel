package ro.serbantudor04.builder;

public class InternareBuilder {

    private Internare internare;
    public InternareBuilder(){
        internare = new Internare();
    }

    public InternareBuilder setNume(String nume) {
        internare.nume = nume;
        return this;
    }

    public InternareBuilder setPrenume(String prenume) {
        internare.prenume = prenume;
        return this;
    }

    public InternareBuilder setVarsta(int varsta) {
        internare.varsta = varsta;
        return this;
    }

    public InternareBuilder setFeat_pat(Boolean feat_pat) {
        internare.feat_pat = feat_pat;
        return this;
    }

    public InternareBuilder setFeat_papuci(Boolean feat_papuci) {
        internare.feat_papuci = feat_papuci;
        return this;
    }

    public InternareBuilder setFeat_mic_dejun(Boolean feat_mic_dejun) {
        internare.feat_mic_dejun = feat_mic_dejun;
        return this;
    }

    public InternareBuilder setFeat_halat(Boolean feat_halat) {
        internare.feat_halat = feat_halat;
        return this;
    }


    public Internare build(){
        return internare;
    }

}
