import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int  Fizik, Kimya, Turkce, Tarih, Muzik;
        Scanner val= new Scanner(System.in);
        System.out.println("Sırasıyla notlarınızı giriniz : \n Fizik \n Kimya \n Turkce \n Tarih \n Muzik");
        Fizik = val.nextInt();
        Kimya = val.nextInt();
        Turkce = val.nextInt();
        Tarih = val.nextInt();
        Muzik = val.nextInt();

        int toplam = (Fizik + Kimya + Turkce + Tarih + Muzik)  ;
        double sonuc= toplam/6;
        System.out.println("Ortalamanız :" +sonuc);

        double a = 60.0;
        String basarılıDurumu= (sonuc>a)?"Sınıfı gecti":"Sınıfta Kaldı" ;
        System.out.println(basarılıDurumu);

    }

}
