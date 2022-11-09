import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		double armut,elma,domates,muz,patlican;
		double toplamTutar;

		System.out.println("Armut kaç kilo ? :");
		armut=scn.nextDouble();
		System.out.println("Elma kaç kilo ? :");
		elma=scn.nextDouble();
		System.out.println("Domates kaç kilo ? :");
		domates=scn.nextDouble();
		System.out.println("Muz kaç kilo ? :");
		muz=scn.nextDouble();
		System.out.println("Patlýcan kaç kilo ? :");
		patlican=scn.nextDouble();
		
		toplamTutar=(armut*2.14)+(elma*3.67)+
				(domates*1.11)+(muz*0.95)+(patlican*5);
		System.out.println("Toplam ödenecek tutar :"+toplamTutar+"TL");
		
				

	}

}
