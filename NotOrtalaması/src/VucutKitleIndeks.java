import java.util.Scanner;
public class VucutKitleIndeks {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double height,weight,index=0;
		System.out.println("Boyunuzu metre cinsinden giriniz.");
		height=scn.nextDouble();
		System.out.println("Kilonuzu kg cinsinden giriniz.");
		weight=scn.nextDouble();
		//verilen formüle göre yapýlan hesaplama index deðiþkenine atanýyor.
		index= weight/(height*height);
		System.out.println("Vücut Kitle Ýndeksiniz:"+index);
	}

}
