import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat;
        int fizik;
        int kimya;
        int turkce;
        int tarih;
        int muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+turkce+tarih+muzik+kimya);
        double sonuc = toplam/6.0;

        System.out.print("Aritmatik Ortalama Sonucu: " + sonuc);





    }
}
