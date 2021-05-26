
class pendel{
    public void tiksumine(double pikkus, int hambad) throws InterruptedException {
        double periood = 2 * Math.PI * Math.sqrt(pikkus/9.8);
        ;
        int ringid;
        int hambadLoendur=5;

        hammasratas h1 = new hammasratas();
        h1.liikumine(3);



        for(int i = 0;i<20;i++){
            System.out.println("Tik");
            Thread.sleep((long)(periood*1000));

            if( hambadLoendur == (hambad)){
                ringid=+1;
                System.out.println("Hammasratta "+ringid+" sai tais");
                hambadLoendur =1;
                hambad=+1;
            }
            hambadLoendur=+1;
        }

    }
}

class hammasratas{


    public void liikumine(int hambad){


    }

}

class Kell {
    public static void main(String[] arg) throws InterruptedException {

        pendel p1 = new pendel();
        p1.tiksumine(0.2, 5);
    }
}