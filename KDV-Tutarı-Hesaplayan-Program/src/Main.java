import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner val= new Scanner(System.in);
                System.out.println("Lutfen ham fiyat bilgisi giriniz :");
                double urunFiyati, urunDegeri;
                urunFiyati = val.nextInt();
                double KDV= (urunFiyati<1000.0)?0.18:0.08;
                urunDegeri= urunFiyati+ (urunFiyati*KDV);
                System.out.println("KDV'li fiyat "+urunDegeri);




    }
}
