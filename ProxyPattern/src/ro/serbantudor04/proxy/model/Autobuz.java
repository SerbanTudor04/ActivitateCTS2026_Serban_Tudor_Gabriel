package ro.serbantudor04.proxy.model;

public class Autobuz implements MijlocDeTransport{
    protected String linia;
    protected Integer nrCalatori;

    public Autobuz(String linia, Integer nrCalatori) {
        this.linia = linia;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul se opreste in statie");
    }
}
