import java.util.Scanner;
public class VucutKitleIndeks {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double boy,kilo,indeks=0;
		System.out.println("Boyunuzu metre cinsinden giriniz.");
		boy=scn.nextDouble();
		System.out.println("Kilonuzu kg cinsinden giriniz.");
		kilo=scn.nextDouble();
		
		indeks= kilo/(boy*boy);
		System.out.println("Vücut Kitle Ýndeksiniz:"+indeks);
	}

}
