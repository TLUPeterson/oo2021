public class Sotsiaalmeedia {
    public String nimetus;
    public String v2rv;
    public int kylastajateArv;

    public Sotsiaalmeedia(String nimetus, String v2rv, int kylastajateArv){
        this.nimetus = nimetus;
        this.v2rv = v2rv;
        this.kylastajateArv = kylastajateArv;
    }

    public void SotsiaalmeediaKirjeldus(){
        System.out.println("Selle sotsiaalmeedia nimetus on "+this.nimetus+", seda iseloomustav v2rv on "+this.v2rv+"ning sellel on "+ this.kylastajateArv+" kylastajat.");

    }
}
