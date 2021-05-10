public class ValuutaValemid implements ValuutaLiides{
    public  double euroToDollar(double euro){
        double dollar;
        dollar = 1.2*euro;
        return dollar;
    }
    public double dollarToEuro(double dollar){
        double euro;
        euro = 0.8*dollar;
        return euro;
    }
    public double euroToPound(double euro){
        double pound;
        pound = 0.86*euro;
        return pound;
    }
    public double poundToEuro(double pound){
        double euro;
        euro = 1.16*pound;
        return euro;
    }
    public double dollarToPound(double dollar){
        double pound;
        pound = 0.71*dollar;
        return pound;
    }
    public double poundToDollar(double pound){
        double dollar;
        dollar = 1.41*pound;
        return dollar;
    }
}