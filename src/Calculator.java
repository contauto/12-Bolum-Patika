
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float toplam=0;
        float j=0;
        float ortalama;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int sayi=scanner.nextInt();

        for (int i = 0; i < sayi; i++) {
            if ((i %3==0)&&(i%4==0)) {
                toplam=toplam+i;
                j++;
            }

        }

        ortalama=toplam/j;
        System.out.println(ortalama);
    }
}
