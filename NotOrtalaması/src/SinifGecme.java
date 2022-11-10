import java.util.Scanner;
public class SinifGecme {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		double mat,fizik,kimya,turkce,muzik,ortalama;
		double toplam=0;
		 System.out.println("Matematik notunuz:");
		 mat=scn.nextDouble();
		 if(mat<100&&mat>0) {
			 toplam=toplam+mat;
		 }
		 
		 System.out.println("Fizik notunuz:");
		 fizik=scn.nextDouble();
		 if(fizik<100&&fizik>0) {
			 toplam=toplam+fizik;
		 }
		 System.out.println("Türkçe notunuz:");
		 turkce=scn.nextDouble();
		 
		 if(turkce<100&&turkce>0) {
			 toplam=toplam+turkce;
		 }
		 System.out.println("Müzik notunuz:");
		 muzik=scn.nextDouble();
		 
		 if(muzik<100&&muzik>0) {
			 toplam=toplam+muzik;
		 }
		 System.out.println("Kimya notunuz:");
		 kimya=scn.nextDouble();
		 if(kimya<100&&kimya>0) {
			 toplam=toplam+kimya;
		 }
		 
		 ortalama=toplam/5;
		 if (ortalama>=55) {
			System.out.println("Tebrikler. Geçtiniz!!");
		}
		 else {
			 System.out.println("Kaldınız.");
		 }
		 
	}

}
