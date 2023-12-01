import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanacağımız değişkenleri tanımladık.
        Scanner input = new Scanner(System.in);
        int km,ucus_tipi,yas;
        double km_ucret=0.1,tutar;

        // Kullanıcı ile etkileşime geçtik.
        System.out.print("Mesafeyi km türünden giriniz: ");
        km=input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        ucus_tipi=input.nextInt();

        // İndirimler uygulanmadan toplam tutarı hesapladık.
        tutar=km*km_ucret;

        // Kullanıcının verileri doğru aralıkta girip girmemesini kontrol ediyoruz.
        if( (km>0) && (yas>0) && (ucus_tipi==1 || ucus_tipi==2)){
            if (yas<12){
                tutar*=0.5;                 // %50 indirim uyguladık
            } else if (yas>=12 && yas<=24) {
                tutar*=0.9;                 // %10 indirim uyguladık
            } else if (yas>=65) {
                tutar*=0.7;                 // %30 indirim uyguladık
            }

            if (ucus_tipi==2){               // Eğer gidiş dönüş ise
                tutar*=0.8;                  // %20 indirim uyguladık
                tutar*=2;                    // Gidiş dönüş olduğu için bilet parası iki ile çarpıldı
            }

            // Sonuç ekrana basıldı.
            System.out.println("Toplam tutar: "+tutar);

        }
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}