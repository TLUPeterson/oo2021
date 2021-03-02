import java.util.Scanner;

class kontroll {
    public static void main(String[] args) {
        System.out.println("Kas arv jagub 2, 3, 5, 7ga");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2==0){
            System.out.println(number+" jagub kahega");
        }
        if (number % 3==0){
            System.out.println(number+" jagub kolmega");
        }
        if (number % 5==0){
            System.out.println(number+" jagub viiega");
        }
        if (number % 7==0){
            System.out.println(number+" jagub seitsmega");
        }
    }
}
