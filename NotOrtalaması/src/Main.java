import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int mat,fizik,kimya,turkce,tarih,muzik;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.print("Matematik dersinizi giriniz");
		mat=inp.nextInt();
		
		System.out.print("Fizik dersinizi giriniz");
		fizik=inp.nextInt();
		
		System.out.print("Kimya dersinizi giriniz");
		kimya=inp.nextInt();
		
		System.out.print("Türkçe dersinizi giriniz");
		turkce=inp.nextInt();
		
		System.out.print("Tarih dersinizi giriniz");
		tarih=inp.nextInt();
		
		System.out.print("Müzik dersinizi giriniz");
		muzik=inp.nextInt();
		
		int toplam= (mat+fizik+kimya+turkce+tarih+muzik);
		
		double sonuc=toplam/6;
		
		System.out.println("Ortalamanýz:"+sonuc);
		
		String son_durum=sonuc >60 ? "Sýnýfý geçtiniz" : "Sýnýfta kaldýnýz.";
		System.out.println(son_durum);
	}

}
