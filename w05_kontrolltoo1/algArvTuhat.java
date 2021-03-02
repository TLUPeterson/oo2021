import java.util.Arrays;

class massiiv {
    static boolean algArv(int n){
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;

    }
    public static void main(String[] args) {
        int pikkus = 1000;
        int[] algA = new int[pikkus];
        int n = 0;
        for (int i =2;n<pikkus;i++){

            if(algArv(i)){
                algA[n]=i;
                n++;
            }
        }
        //Teine osa
        int tuhatRuut = algA[999]*algA[999];
        System.out.println(Arrays.toString(algA));
        System.out.println(algA[999]);
        System.out.println(tuhatRuut);
        int[] kymme = new int[10];
        int m=0;
        for (int i =tuhatRuut;m<10;i--){
            if(algArv(i)){
                kymme[m]=i;
                m++;
            }
        }
        System.out.println(Arrays.toString(kymme));
    }
}
