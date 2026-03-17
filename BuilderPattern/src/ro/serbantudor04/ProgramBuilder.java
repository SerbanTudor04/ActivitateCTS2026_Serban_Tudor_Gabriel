package ro.serbantudor04;

import ro.serbantudor04.builder.Internare;
import ro.serbantudor04.builder.InternareBuilder;

public class ProgramBuilder {
    public static void main(String[] args) {
        Internare internare = new InternareBuilder()
                .setNume("Tudor")
                .setPrenume("Serban")
                .setVarsta(25)
                .setFeat_pat(true)
                .build();


        System.out.println(internare);
    }
}
