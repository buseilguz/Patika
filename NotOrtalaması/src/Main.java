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
		
		System.out.print("T�rk�e dersinizi giriniz");
		turkce=inp.nextInt();
		
		System.out.print("Tarih dersinizi giriniz");
		tarih=inp.nextInt();
		
		System.out.print("M�zik dersinizi giriniz");
		muzik=inp.nextInt();
		
		int toplam= (mat+fizik+kimya+turkce+tarih+muzik);
		
		double sonuc=toplam/6;
		
		System.out.println("Ortalaman�z:"+sonuc);
		
		String son_durum=sonuc >60 ? "S�n�f� ge�tiniz" : "S�n�fta kald�n�z.";
		System.out.println(son_durum);
	}

}
