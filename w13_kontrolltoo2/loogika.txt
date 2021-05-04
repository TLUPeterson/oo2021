interface loogikaLiides{
    boolean seisund=false;
    boolean kanal1=false;
    boolean kanal2=false;

}
class loogikaAND implements loogikaLiides{
    boolean kanal1;
    boolean kanal2;
    boolean seisund;
    String nimi;

    public boolean signaal(boolean kanal1, boolean kanal2, String nimi) {

        if (kanal1 && kanal2) {
            System.out.println(nimi + "true");
            seisund = true;
        } else {
            System.out.println(nimi + "false");
            seisund = false;
        }
        return seisund;

    }
 }
 class loogikaOR implements loogikaLiides {
     boolean kanal1;
     boolean kanal2;
     boolean seisund;
     String nimi;

     public boolean signaal(boolean kanal1, boolean kanal2, String nimi) {
         if (kanal1 || kanal2) {
             System.out.println(nimi + "true");
             seisund = true;
         } else {
             System.out.println(nimi + "false");
             seisund = false;
         }
         return seisund;
     }
 }
 class loogikaNOT implements loogikaLiides{
    boolean kanal1;
    boolean seisund;
    public boolean signaal(boolean kanal1,  String nimi){

        if (kanal1){
            System.out.println(nimi + "false");
            seisund = false;
        }else{
            System.out.println(nimi + "true");
            seisund = true;
        }
        return seisund;

    }

}

     public class loogika {
         public static void main(String[] args) {
            boolean s1 = true;
            boolean s2 = false;

             loogikaAND l1 = new loogikaAND();
             l1.signaal(s1, s2, "Esimene: ");
             loogikaAND l2 = new loogikaAND();
             l2.signaal(s1, s1, "Teine: ");


             loogikaOR l3 = new loogikaOR();
             l3.signaal(s2, l2.seisund, "Kolmas: ");

             loogikaAND l4 = new loogikaAND();
             l4.signaal(l1.seisund, l3.seisund, "Neljas: ");

             loogikaNOT l5 = new loogikaNOT();
             l5.signaal(l4.seisund, "Viies: ");






         }
     }
