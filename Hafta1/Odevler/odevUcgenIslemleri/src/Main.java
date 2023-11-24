import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Dik üçgen de kullanıcıdan alınan dik kenarlar ile hipotenüs hesaplama
        Hipotenüs^2 = a^2 + b^2      ^  üs
        NOT:  Math.sqrt(16)       4 Math kütüphanesinden sqrt ile karekök hesaplayabilirsiniz
        Math.pow(4,2)  16 Math kütüphanesinden power
        */

        // degiskenleri tanimliyoruz
        Scanner input = new Scanner(System.in);
        int kenar1,kenar2;
        double hipotenus;

        // Kullanici ile etkilesime geciyoruz
        System.out.println("Soru1 ****--------------->");
        System.out.print("kenar1 i giriniz: ");
        kenar1 =input.nextInt();
        System.out.print("kenar2 yi giriniz: ");
        kenar2=input.nextInt();

        // hipotenusu bulan matematiksel ifadeyi uyguluyoruz
        hipotenus=Math.sqrt(Math.pow(kenar1,2)+Math.pow(kenar2,2));

        // sonuc
        System.out.println("hipotenus: "+hipotenus);


        /*
        Üçgen de kullanıcıdan alınan üç kenar ile alanını ve çevresini hesaplama
        Alan^2 = u * (u-kenar1) * (u-kenar2) * (u-kenar3)
        u = (kenar1+kenar2+kenar3)/2
        Çevre = 2u
        */

        // degiskenleri tanimliyoruz
        int edge1, edge2,edge3,sum;
        double u,alan;
        // girdileri aliyoruz
        System.out.println("Soru2 ****--------------->");
        System.out.print("edge1 i giriniz: ");
        edge1=input.nextInt();
        System.out.print("edge2 yi giriniz: ");
        edge2=input.nextInt();
        System.out.print("edge3 u giriniz: ");
        edge3=input.nextInt();
        // alani bulmak icin gerekli matematiksel islemleri yapiyoruz
        sum = edge1+edge2+edge3;
        u = sum/2.0;
        System.out.println("u: "+u);
        alan = Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));
        //sonuc
        System.out.print("alan: "+alan);

    }
}