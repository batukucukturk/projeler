package AtmProject;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, passWord;
        int right = 3, select, balance = 2000, price;

        while (right > 0) {
            System.out.print("Kullanıcı Adını Girin :");
            userName = inp.nextLine();
            System.out.print("Şifrenizi Girin :");
            passWord = inp.nextLine();
            if (userName.equals("patika") && passWord.equals("dev123")) {
                System.out.print("Patika Bankasına Hoş Geldiniz!!");
                do {
                    System.out.println("Lütfen Yapacağınız İşlemi Seçin :\n" +
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı :");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı :");
                            price = inp.nextInt();
                            if (price<=balance) {
                                balance -= price;
                            }else System.out.println("=================\n " +
                                    "Yetersiz Bakiye!!\n" +
                                    "=================");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        case 4:
                            System.out.println("Hoşçakalın!");
                            break;
                        default:
                            System.out.println("Hatalı Giriş Yaptınız.");
                            break;

                    }

                } while (select != 4);
                  break;


            } else {
                System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyin.");
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Bankayla İletişime Geçin.!!");
                } else System.out.println("Kalan Hakkınız :" + right);

            }
        }


    }
}
