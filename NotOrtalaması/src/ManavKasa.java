import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		double pear,apple,tomato,banana,eggplant;
		double total;
		//istenilen de�i�kenlere kullan�c�dan al�nan de�erler atan�yor.
		System.out.println("Armut ka� kilo ? :");
		pear=scn.nextDouble();
		System.out.println("Elma ka� kilo ? :");
		apple=scn.nextDouble();
		System.out.println("Domates ka� kilo ? :");
		tomato=scn.nextDouble();
		System.out.println("Muz ka� kilo ? :");
		banana=scn.nextDouble();
	
		System.out.println("Patl�can ka� kilo ? :");
		eggplant=scn.nextDouble();
		//�denecek toplam tutar hesaplan�yor.
		total=(pear*2.14)+(apple*3.67)+
				(tomato*1.11)+(banana*0.95)+(eggplant*5);
		System.out.println("Toplam �denecek tutar :"+total+"TL");
		
				

	}

}
