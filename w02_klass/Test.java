public class Test {
    public static void main(String[] arg){
        Valuuta valuuta = new Valuuta();
        System.out.println(valuuta.euroToDollar(10));
        System.out.println(valuuta.dollarToEuro(10));
        System.out.println(valuuta.euroToPound(10));
        System.out.println(valuuta.poundToEuro(10));
    }
}