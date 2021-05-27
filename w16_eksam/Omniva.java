public class Omniva {
    public double checker(double laius, double sugavus, double korgus) {
        //Omniva If
        double O_Hind=0;
        if (laius <= 38 && sugavus <= 64 && korgus <= 9) {
            O_Hind = 2.95;

        } else if (laius <= 38 && sugavus <= 64 && korgus <= 19) {
            O_Hind = 3.98;

        } else if (laius <= 38 && sugavus <= 64 && korgus <= 29) {
            O_Hind = 4.85;

        } else {
            O_Hind=1000;
        }

        return O_Hind;
    }
}