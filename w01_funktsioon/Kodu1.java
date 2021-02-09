import java.text.DecimalFormat;

class Kodu1 {
    public static void main(String[] arg) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        double algusAasta = 1977;
        double kiirus = 61200; //km/h
        double aastaTunnid = 8760;
        System.out.println("Sisesta, millise aasta Voyager 1 kaugust Maast soovid vaadata: ");
        double valitudAasta = Integer.parseInt(arg[0]);
        double kaugusMaast = (valitudAasta - algusAasta) * (kiirus * aastaTunnid);
        System.out.println("Aastal " + valitudAasta + " asub Voyager1 umbes " + formatter.format(kaugusMaast) + " km Maast");
    }
}
