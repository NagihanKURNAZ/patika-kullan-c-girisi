import java.nio.channels.SelectableChannel;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Main {

	public static void main(String[] args) {
		
		String userName = "patika";
		String password = "Java123";
		String select;
		String newPassword;
		boolean check = true;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanıcı  Adınızı Giriniz: ");
		userName=input.nextLine();
		System.out.println("Şifrenizi Giriniz: ");
		password=input.nextLine();
		
		if(userName.equals("patika")&&password.equals("Java123")){
			System.out.println("giriş yaptınız.");
		}
			else if(userName!="patika") {
				System.out.println("Kullanıcı adınızı yanlış girdiniz.");	
			}
			else if(password!="Java123") {
				System.out.println("şifrenizi yanlış girdiniz.");
				
			}
		while (check){
            System.out.print("Şifrenizi değiştirmek ister misiniz? (y/n)"); int a = input.nextLine().charAt(0);
            switch (a){
                case 'y' :
                    System.out.print("Lütfen yeni şifrenizi giriniz:"); newPassword = input.nextLine();
                    if (newPassword.equals("Java123") || newPassword.equals(password)){
                        System.out.println("Şifreniz eski şifreniz ile aynı olamaz. Üst menüye aktarılıyorsunuz.");
                    }
                    else {
                        System.out.println("Yeni şifreniz başarılı bir şekilde oluşturuldu.");
                        System.out.println("Çıkış yapılıyor...");
                        check = false;
                        break;
                    }
                    break;
                case 'n':
                    System.out.println("Çıkış yapılıyor..");
                    check = false;
                    break;
                default:
                    System.out.println("Hatalı işlem seçtiniz. Üst menüye aktarılıyorsunuz.");
		
		}
		
	}
		
		
		
	}

}
