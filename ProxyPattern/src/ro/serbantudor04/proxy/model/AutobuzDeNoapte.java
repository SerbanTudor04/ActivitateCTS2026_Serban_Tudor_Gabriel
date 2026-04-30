package ro.serbantudor04.proxy.model;

public class AutobuzDeNoapte implements MijlocDeTransport{
    private MijlocDeTransport autobuz;

    public AutobuzDeNoapte(MijlocDeTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if (autobuz == null) {
            System.out.println("Nu exista autobuz");
            return;
        }
        if (((Autobuz)autobuz).nrCalatori >0 ){
            System.out.println("Nu se poate opreste in statie, exista calatori");
            return;
        }

        System.out.println("Autobuzul de noapte se opreste in statie");
    }
}
