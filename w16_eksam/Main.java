import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Tere! See programm on loodud, et te saaksite vaadata mis transpordifirmaga on kõige odavam transportida teie pakki.");

        System.out.println("Sisestage paki laius: ");
        Scanner input = new Scanner(System.in);
        double laius = input.nextDouble();

        System.out.println("Sisestage paki sügavus: ");
        Scanner input2 = new Scanner(System.in);
        double sugavus = input2.nextDouble();

        System.out.println("Sisestage paki korgus: ");
        Scanner input3 = new Scanner(System.in);
        double korgus = input3.nextDouble();

        Omniva o1 = new Omniva();
        double omnivaHind = o1.checker(laius, sugavus, korgus);
        //System.out.println(o1.checker(laius, sugavus, korgus));
        Itella i1 = new Itella();
        double itellaHind = i1.checker(laius, sugavus, korgus);
        Dpd d1 = new Dpd();
        double dpdHind = d1.checker(laius, sugavus, korgus);

        System.out.println("");
        if (itellaHind == 1000){
            System.out.println("Kahjuks on pakk liiga suur Itella pakiautomaadi jaoks.");
        }else{
            System.out.println("Selle paki saatmine Itellaga maksaks: " + itellaHind + "€.");
        }
        if (omnivaHind == 1000){
            System.out.println("Kahjuks on pakk liiga suur Omniva pakiautomaadi jaoks.");
        }else{
            System.out.println("Selle paki saatmine Omnivaga maksaks: " + omnivaHind + "€.");
        }
        if (dpdHind == 1000){
            System.out.println("Kahjuks on pakk liiga suur DPD pakiautomaadi jaoks.");
        }else{
            System.out.println("Selle paki saatmine Dpd-ga maksaks: " + dpdHind + "€.");
        }
        System.out.println("");

        if (itellaHind == 1000 && omnivaHind == 1000 && dpdHind == 1000){
            System.out.println("Kahjuks on pakk liiga suur et saata pakiautomaadiga. Palun uurige teisi viise pakki saata. Näiteks kuller");
        }else{
            Kalkulaator kalk1 = new Kalkulaator();
            kalk1.checkers(omnivaHind, itellaHind, dpdHind);
        }

    }
}