import java.text.DecimalFormat;

class Kodu1 {

    public static double kaugusMaast(double i){
        double algusAasta = 1977;
        double kiirus = 61200; //km/h
        double aastaTunnid = 8760;
        return (i - algusAasta) * (kiirus * aastaTunnid);
    }
    public static void main(String[] arg) {
        double valitudAasta = Integer.parseInt(arg[0]);
        DecimalFormat formatter = new DecimalFormat("#,###");

        System.out.println("Sisesta, millise aasta Voyager 1 kaugust Maast soovid vaadata: ");

        System.out.println("Aastal " + valitudAasta + " asub Voyager1 umbes " + formatter.format(kaugusMaast(valitudAasta)) + " km Maast");
    }
}
