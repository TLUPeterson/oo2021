public class Kodutoo2 {
    public static void main(String[] arg){
        Pood pood = new Pood(10);
        Ladu laoseis = new Ladu(50, pood);

        System.out.println("Poes on "+pood.poeLeibKogus()+" leiba ning laos on "+laoseis.annaLeibKogus()+" leiba.");

        System.out.println("Ostan 2 leiba, poes on alles: "+pood.ostaLeib(12));
        if(laoseis.kasVajabJuurde()){
            System.out.println("Poodi on leiba juurde vaja");
        }else{
            System.out.println("Poes on piisavas koguses leiba.");
        }
    }
}
