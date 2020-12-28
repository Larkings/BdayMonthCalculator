public class jarig {
    int maandHuidig;
    int maandJarig;
    int maandenInJaar = 12;
    int maandenTotVerjaardag;

    void antwoord(){
        if(maandJarig < maandHuidig){
            maandenTotVerjaardag = (maandJarig - maandHuidig) + maandenInJaar;
        }
        else{
            maandenTotVerjaardag = maandJarig - maandHuidig;
        }
        System.out.println("je bent jarig over "+ maandenTotVerjaardag + " maand(en).");
    }
}

