import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler tanımlandı
        Scanner input = new Scanner(System.in);
        int select;
        double a,b,result=0;
        String islem;

        // Kullanıcı bilgilendirildi
        System.out.println("Hesap Makinesine Hoşgeldiniz");
        System.out.println("1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");

        // Kullanıcı ile etkileşime geçildi
        System.out.print("Lütfen işlem seçiniz: ");
        select=input.nextInt();

        // Kod blokları ile sonuç hesaplandı
        if ((select>=1) && (select<=4)){
            System.out.print("1.sayıyı giriniz: ");
            a=input.nextInt();
            System.out.print("2.sayıyı giriniz: ");
            b=input.nextInt();

            if (select==1){
                result=a+b;
                islem="Toplama";
            } else if (select==2) {
                result=a-b;
                islem="Çıkarma";
            } else if (select==3) {
                result=a*b;
                islem="Çarpma";
            } else{
                if (b!=0){
                    result = a / b;
                    islem="Bölme";
                }else{
                    islem="Hatalı";
                }

            }

            if (!islem.equals("Hatalı")){
                System.out.println(islem+" işlemi sonucunuz: "+result);
            }
        }
    }
}