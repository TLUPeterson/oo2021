public class Dpd {
    public double checker(double laius, double sugavus, double korgus) {
        //Omniva If
        double D_Hind=0;
        if (laius <= 19 && sugavus <= 64 && korgus <= 9) {
            D_Hind = 3.95;

        } else if (laius <= 40 && sugavus <= 64 && korgus <= 19) {
            D_Hind = 4.98;

        } else if (laius <= 40 && sugavus <= 64 && korgus <= 29) {
            D_Hind = 5.85;

        } else if (laius <= 40 && sugavus <= 60 && korgus <= 37) {
            D_Hind = 5.85;

        } else {
            D_Hind=1000;
        }

        return D_Hind;
    }
}