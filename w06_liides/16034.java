import java.time.LocalTime;
interface aeg{
    public void alga();
    public void lopeta();
    public void kell();
}

class teenus implements aeg {
    LocalTime myObj = LocalTime.now();
    public void alga() {
        System.out.println("Algas");
    }

    public void lopeta() {
        System.out.println("Loppes");
    }
    public void kell(){
        System.out.println(myObj);
    }

}
class tulevik implements aeg {
    LocalTime myObj = LocalTime.now();

    public void alga() {
        System.out.println("Tulevikku vaatamine");
    }

    public void lopeta() {
        System.out.println("Tulevik naaseb olevikule");
    }

    public void kell() {
        System.out.println("Tulevikus on kell: " + myObj.plusHours(2));
    }
}



class Main{
    public static void main(String[] arg){
        teenus esimene = new teenus();
        tulevik tulevik = new tulevik();
        esimene.alga();
        esimene.kell();
        esimene.lopeta();

        tulevik.alga();
        tulevik.kell();
        tulevik.lopeta();

    }
}