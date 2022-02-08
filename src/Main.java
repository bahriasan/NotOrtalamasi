import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, dersSayisi=0;
        double average, toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Mat Notunu Girin");
        mat = input.nextInt();
        if(mat>=0 && mat<=100){
            toplam =toplam+mat;
            dersSayisi++;
        }
        System.out.println("Fizik Notunu Girin");
        fizik = input.nextInt();
        if(fizik>=0 && fizik<=100){
            toplam =toplam+fizik;
            dersSayisi++;
        }
        System.out.println("Türkçe Notunu Girin");
        turkce = input.nextInt();
        if(turkce>=0 && turkce<=100){
            toplam =toplam+turkce;
            dersSayisi++;
        }
        System.out.println("Kimya Notunu Girin");
        kimya = input.nextInt();
        if(kimya>=0 && kimya<=100){
            toplam =toplam+kimya;
            dersSayisi++;
        }
        System.out.println("Müzik Notunu Girin");
        muzik = input.nextInt();
        if(muzik>=0 && muzik<=100){
            toplam =toplam+muzik;
            dersSayisi++;
        }

        average = toplam/dersSayisi;
        System.out.println("Ortalamanız: " + average);


        if(average>=50){
            System.out.println("Sınıfı Geçtiniz");
        }else{
            System.out.println("Sınıfta Kaldınız");
        }
    }
}
