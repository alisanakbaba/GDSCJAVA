import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*              KULLANICI GİRİŞİ
        - Kullanıcıdan username ve password isteyin,Kullanıcının girdiği parola sizin belirlediğiniz paroladan farklı ise
        kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        Scanner input = new Scanner(System.in);
        String user_name,password,durum;

        System.out.print("Kullanıcı adınızı giriniz: ");
        user_name=input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password=input.nextLine();


        if ( (user_name.equals("alisan")) && (password.equals("Password")) ){
            System.out.println("Sisteme başarıyla giriş yaptınız");
        } else if (user_name.equals("alisan")) {
            System.out.println("Hatalı password\n" +
                    "Şifrenizi sıfırlamak ister misiniz\n" +
                    "Evet veya Hayır yazınız");
            durum=input.nextLine();
            if (durum.equals("Evet")){
                System.out.print("Yeni şifrenizi giriniz: ");
                password=input.nextLine();
                if (password.equals("Password")){
                    System.out.println("Şifre oluşturulamadı.");
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        } else {
            System.out.println("userName ve passsword hatalı");
        }
    }
}