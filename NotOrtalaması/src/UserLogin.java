import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        String username, password;
        System.out.println("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış.");
            int select;

            System.out.println("Şifrenizi sıfırlamak ister misiniz? E / H");
            select = input.nextByte();
            switch (select) {
                case 1:
                    String newPassword;
                    Scanner src = new Scanner(System.in);
                    System.out.println("Yeni sifrenizi giriniz.");
                    newPassword = src.nextLine();
                    if(newPassword.equals(password)){
                        System.out.println("Yeni şifreniz eski şifre ile aynı olmamalıdır.");
                    }else{
                        System.out.println("Şifre başarıyla oluşturuldu.");
                    }
                    break;
            
                case 2:
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
