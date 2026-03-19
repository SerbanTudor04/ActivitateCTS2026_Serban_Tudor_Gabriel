package ro.serbantudor04.restaurant.rezervare;

import java.util.HashMap;
import java.util.Map;

public class ContRegistry {
    public static ContRegistry instance;

    private Map<String,Cont> conturi;
    private ContRegistry(){
        this.conturi = new HashMap<>();
    }


    public static ContRegistry getInstance(){
        if (instance == null) {
            return new ContRegistry();
        }
        return instance;
    }

    public ContRegistry add(Cont cont){
        if(conturi.containsKey(cont.getNume())){
            System.out.println("Contul exista deja "+cont);
            return this;
        }

        conturi.put(cont.getNume(),cont);
        return this;
    }


    public Cont get(String nrCont){
        return conturi.get(nrCont);
    }

    public ContRegistry remove(String nrCont){
        conturi.remove(nrCont);
        return this;
    }

    public ContRegistry remove(Cont cont){
        conturi.remove(cont.getNrCont());
        return this;
    }

}
