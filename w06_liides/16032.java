interface pikkused{
    void kylgedepikkused(int a, int b, int c);
}
class kolmnurk implements pikkused{
    public void kylgedepikkused(int a, int b, int c){
        System.out.println("Kolmnurga kylgedepikkus on: "+(a+b+c));
    }
}
class Main{
    public static void main(String[] arg){
        kolmnurk k1 = new kolmnurk();
        k1.kylgedepikkused(2, 6, 3);
    }
}