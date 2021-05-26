public class Proov1 {
    public static void main(String[] arg) {
        Puhver<Integer, Integer> p1 = new Puhver<Integer, Integer>(new RuuduArvutaja());
        System.out.println(p1.arvuta(4));
        System.out.println(p1.arvuta(2));
        System.out.println(p1.arvuta(10));
        System.out.println(p1.hoidla);

        Puhver<String, String> p2 = new Puhver<String, String>(new Duubeldaja());
        System.out.println(p2.arvuta("Peeter"));
        System.out.println(p2.arvuta("Paan"));
        System.out.println(p2.arvuta("Test"));
        System.out.println(p2.hoidla);

        Puhver<String, String> p3 = new Puhver<String, String>(new EsimenePoolitaja());
        System.out.println(p3.arvuta("proov1"));
        System.out.println(p3.arvuta("peeter"));
        System.out.println(p3.arvuta("paan"));
        System.out.println(p3.arvuta("haraso"));
        System.out.println(p3.hoidla);

    }
}