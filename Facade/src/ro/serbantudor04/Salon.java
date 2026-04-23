package ro.serbantudor04;

public class Salon {
    private final boolean []paturiLibere;

    public Salon(){
        this.paturiLibere = new boolean[10];
        this.paturiLibere[0] = true;


    }

    public int getPatLiber(){
        for(int i = 0; i < this.paturiLibere.length; i++){
            if(this.paturiLibere[i])
                return i;
        }

        return -1;
    }


    public void ocupaPat(int pat){
        this.paturiLibere[pat] = false;
    }

}
