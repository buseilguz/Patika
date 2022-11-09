import java.util.Scanner;
public class Taksimetre {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double km;
		double total;
		System.out.println("Yol uzunluðunu Km cinsinden giriniz");
		km=scn.nextDouble();
		total= 10 + (km*2.20);
		total=(total<20)? 20 : total;
		System.out.println("Toplam ödenecek tutar:"+total);
				

	}

}
