import java.util.Scanner;
public class Siralama {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int sayi1,sayi2,sayi3;
		System.out.println("!.sayıyı giriniz.");
		sayi1=scn.nextInt();
		
		System.out.println("2.sayıyı giriniz.");
		sayi2=scn.nextInt();
		
		System.out.println("3.sayıyı giriniz.");
		sayi3=scn.nextInt();
		if (sayi1<sayi2&& sayi1<sayi3) {
			if (sayi2<sayi3) {
				System.out.println("1.sayı< 2.sayı < 3.sayı");
			}else {
				System.out.println("1.sayı< 3.sayı < 2.sayı");
			}
		}
		if (sayi2<sayi1&& sayi2<sayi3) {
			if (sayi1<sayi3) {
				System.out.println("2.sayı< 1.sayı < 3.sayı");
			}else {
				System.out.println("2.sayı< 3.sayı < 1.sayı");
			}
		}
		if (sayi3<sayi2&& sayi3<sayi1) {
			if (sayi2<sayi1) {
				System.out.println("3.sayı< 2.sayı < 1.sayı");
			}else {
				System.out.println("3.sayı< 1.sayı < 2.sayı");
			}
		}
	}

}
