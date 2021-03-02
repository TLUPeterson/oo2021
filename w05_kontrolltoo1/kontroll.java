import java.util.Scanner;

class kontroll{
    static boolean algArv(int n){
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valitud =  scanner.nextInt();

        if (algArv(valitud))
            System.out.println(valitud + " on algarv");
        else
            System.out.println(valitud + " ei ole algarv");
    }

}