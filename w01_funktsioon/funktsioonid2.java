class funktsioonid2 {
	//sisse astumine 3, km 80senti
	public static double taksosoit(double i){
		return 3+i*0.80;
	}
	public static String temperatuuriHinnang(int t){
		if(t<18){return "külm";}
		return "soe";
	}
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}
    public static void main(String[] args) {
		System.out.println(taksosoit(10));

		}
    }