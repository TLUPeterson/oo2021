public class Itella {
    public double checker(double laius, double sugavus, double korgus) {
        //Itella If
        double I_Hind=0;
        if(laius <= 34 && sugavus <= 42 && korgus <= 5){
            I_Hind = 2.59;
        }
        else if (laius <= 34 && sugavus <= 42 && korgus <= 12){
            I_Hind = 2.99;
        }
        else if (laius <= 34 && sugavus <= 42 && korgus <= 20){
            I_Hind = 3.99;
        }
        else if (laius <= 36 && sugavus <= 42 && korgus <= 34){
            I_Hind = 4.99;
        }
        else if (laius <= 36 && sugavus <= 60 && korgus <= 60){
            I_Hind = 5.50;
        }
        else{
            I_Hind=1000;
        }

        return I_Hind;
    }
}