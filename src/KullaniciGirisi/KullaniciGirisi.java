package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password, select;
        /* kullanıcı adımız :patika
         *  şifremiz :java123 */

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz :");
        userName = inp.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Kullabıcı adı ve şifre doğru.\nHoşgeldiniz...");

        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Şifreniz Yanlış, Yeni Bir Şifre Oluşturmak İstiyor musunuz?\nEvet/Hayır");
            String yeniSifre = inp.nextLine();
            switch (yeniSifre) {
                case "evet":
                    System.out.print("Yeni Şifrenizi Yazınız :");
                    select = inp.nextLine();

                    if (select.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.!!");

                    } else {
                        System.out.print("Yeni Şifreniz Oluşturuldu");

                    }
                    break;


                case "hayır":
                    System.out.println("İşlem Sona Erdi");
                    break;
                default:
                    System.out.println("Yanlış Seçim");
                    break;
            }


        } else {
            System.out.println("Giriş Başarısız Lütfen Tekrar Deneyiniz!!");
        }


    }
}
