 class Hammasratas {
    int praeguneHammas = 1;
    int mitmesRing;
    int hambad;

    public Hammasratas(int arv) {
        hambad = arv;
    }

    public void edasi() {
        praeguneHammas++;
        if(praeguneHammas == (hambad + 1)) {
            mitmesRing++;
            System.out.println("Hammasrattal sai täis ring number " + mitmesRing);
            praeguneHammas = 1;
        }
    }
}
 class Pendel {
    double vonkeperiood;
    long vonge;
    public Pendel(double pikkus, Hammasratas ratas) throws InterruptedException {
        vonkeperiood = 2 * Math.PI * Math.sqrt(pikkus / 9.8);
        vonge = (long) vonkeperiood * 1000;
        while(true) {
            System.out.println("Tik");
            Thread.sleep(vonge);
            //ratas.edasi();

            System.out.println("Tak");
            Thread.sleep(vonge);
            //ratas.edasi();

        }
    }
}
 class Proov {
    public static void main(String[] arg) throws InterruptedException {
        Hammasratas hr = new Hammasratas(8);
        Pendel pendel = new Pendel(0.65, hr);
    }
}