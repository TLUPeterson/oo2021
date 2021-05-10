public class Kodutoo3 {
    public static void main(String[] arg){
        ValuutaLiides eurDol = new ValuutaValemid();
        System.out.println(eurDol.euroToDollar(10));

        ValuutaLiides dolEur = new ValuutaValemid();
        System.out.println(dolEur.dollarToEuro(10));
    }
}
