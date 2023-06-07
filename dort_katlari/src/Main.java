import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, total = 0;
        do {
            System.out.print("Sayi giriniz. Tek sayi girene kadar sayi girmeye devam edeceksiniz.");
            n = scan.nextInt();
            if(n % 4 == 0) {
                total += n;
            }
        } while( n % 2 == 0);

        System.out.println("Girmis oldugunuz sayilardan 4'un katlarinin toplami : "+total);
    }
}