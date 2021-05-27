public class Kalkulaator {
    public void checkers(double Omniva, double Itella, double Dpd) {

        //System.out.println(Omniva+" "+Itella+" "+Dpd);
        //Kui erroreid ei ole e mahub k]ikki kolme automaati
        if(Omniva<Itella && Omniva<Dpd){
            System.out.println("Koige odavam on pakki saata Omnivaga ning hinnaks on: "+Omniva);
        }else if(Itella<Dpd){
            System.out.println("Koige odavam on pakki saata Itellaga ning hinnaks on: "+Itella);
        }else{
            System.out.println("Koige odavam on pakki saata Dpdga ning hinnaks on: "+Dpd);
        }
    }
}