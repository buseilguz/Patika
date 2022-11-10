import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		double pear,apple,tomato,banana,eggplant;
		double total;
		//istenilen deðiþkenlere kullanýcýdan alýnan deðerler atanýyor.
		System.out.println("Armut kaç kilo ? :");
		pear=scn.nextDouble();
		System.out.println("Elma kaç kilo ? :");
		apple=scn.nextDouble();
		System.out.println("Domates kaç kilo ? :");
		tomato=scn.nextDouble();
		System.out.println("Muz kaç kilo ? :");
		banana=scn.nextDouble();
	
		System.out.println("Patlýcan kaç kilo ? :");
		eggplant=scn.nextDouble();
		//ödenecek toplam tutar hesaplanýyor.
		total=(pear*2.14)+(apple*3.67)+
				(tomato*1.11)+(banana*0.95)+(eggplant*5);
		System.out.println("Toplam ödenecek tutar :"+total+"TL");
		
				

	}

}
