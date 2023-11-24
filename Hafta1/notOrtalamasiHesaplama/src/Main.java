import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Not Ortalaması Hesaplayan Program
           Matematik, Fizik, Kimya, Türkçe, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve
           ortalamalarını hesaplayıp ekrana bastırılan programı yazın. 60 tan aşağı ise sınıfta kalsın yukarısı ise geçti yazdırsın*/

        // Değişkenler Tanımlandı

        int matNot , fizikNot , kimyaNot , turkceNot , tarihNot,toplam=0;
        double ortalama;   // Bölme işlemleri sonucunda elde edileceği için virgüllü çıkabilir.
        String result;     // ortalamayı koşula göre (60>) ise sonucu atayacağımız değişken

        // Kullanıcı ile etkileşime geçildi
        System.out.print("Matematik notunu giriniz: ");
        matNot=input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizikNot=input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimyaNot=input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkceNot=input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarihNot=input.nextInt();

        toplam = matNot+fizikNot+kimyaNot+turkceNot+tarihNot;

        // Ortalama bulundu ve sonuç kullanıcıya bildirildi
        ortalama = toplam/5.0;                                       // ortalamayı "double" olarak atadık int bir değeri double bir değere bölmeliyiz ki sonucu doğru versin.
        System.out.println("Ortalamanız:\t"+ortalama);               // 5.0 diyerek 5 i double yaptık hata vermeyecek yani eğer sonucumuz double bir değer ise bölünen sayı double olmalı.
        result = ortalama>=60 ? "Sınıfı geçti.":"Sınıfta kaldı";
        System.out.println("Sonuç: "+result);

    }
}