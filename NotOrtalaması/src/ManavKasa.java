import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		double armut,elma,domates,muz,patlican;
		double toplamTutar;

		System.out.println("Armut ka� kilo ? :");
		armut=scn.nextDouble();
		System.out.println("Elma ka� kilo ? :");
		elma=scn.nextDouble();
		System.out.println("Domates ka� kilo ? :");
		domates=scn.nextDouble();
		System.out.println("Muz ka� kilo ? :");
		muz=scn.nextDouble();
		System.out.println("Patl�can ka� kilo ? :");
		patlican=scn.nextDouble();
		
		toplamTutar=(armut*2.14)+(elma*3.67)+
				(domates*1.11)+(muz*0.95)+(patlican*5);
		System.out.println("Toplam �denecek tutar :"+toplamTutar+"TL");
		
				

	}

}
