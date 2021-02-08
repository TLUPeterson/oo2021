import java.text.DecimalFormat;

class Kodu1 {
    public static void main(String[] arg) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        int algusAasta = 1977;
        int kiirus = 61200; //km/h
        int aastaTunnid = 8760;
        System.out.println("Sisesta, millise aasta Voyager 1 kaugust Maast soovid vaadata: ");
        int valitudAasta = Integer.parseInt(arg[0]);
        int kaugusMaast = (valitudAasta - algusAasta) * (kiirus * aastaTunnid);
        System.out.println("Aastal " + valitudAasta + " asub Voyager1 umbes " + formatter.format(kaugusMaast) + " km Maast");
    }
}