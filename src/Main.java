import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //mukemmel sayi = Bir sayının kendisi hariç pozitif tam sayı çarpanları
        // (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        // 28 = 1 + 2 + 4 + 7 + 14
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int sayi = input.nextInt();
        for (int i = 1; i <sayi ; i++) {
            if (sayi %i==0 ) {
                toplam = i + toplam;

                }
            }
        if (toplam == sayi){
            System.out.println(toplam  + "mükemmel sayıdır");

        }else{
            System.out.println(sayi  + "mükemmell sayı değildir");



        }



    }
}