import java.util.Scanner;

import javax.naming.ldap.ExtendedResponse;
import javax.print.DocFlavor.INPUT_STREAM;

public class Main {

	public static void main(String[] args) {

		int matematik, fizik, türkçe, kimya, müzik;
		int toplam = 0;
		int ders_sayısı = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Matematik notunuzu giriniz: ");
		matematik = input.nextInt();
		if (matematik > 0 && matematik <= 100) {
			toplam = toplam + matematik;
			ders_sayısı++;
		}

		System.out.println("Türkçe notunuzu giriniz: ");
		türkçe = input.nextInt();
		if (türkçe > 0 && türkçe <= 100) {
			toplam = toplam + türkçe;
			ders_sayısı++;
		}

		System.out.println("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();

		System.out.println("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();

		System.out.println("Müzik notunuzu giriniz: ");
		müzik = input.nextInt();

		double average = toplam / ders_sayısı;

		if (average <= 55) {
			System.out.println("Sınıfta kaldınız");
		} else {
			System.out.println("Sınıfı başarıyla geçtiniz");
		}

		System.out.println("Ortalamanız: " + average);
	}

}
