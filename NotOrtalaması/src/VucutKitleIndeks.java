import java.util.Scanner;
public class VucutKitleIndeks {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double height,weight,index=0;
		System.out.println("Boyunuzu metre cinsinden giriniz.");
		height=scn.nextDouble();
		System.out.println("Kilonuzu kg cinsinden giriniz.");
		weight=scn.nextDouble();
		//verilen form�le g�re yap�lan hesaplama index de�i�kenine atan�yor.
		index= weight/(height*height);
		System.out.println("V�cut Kitle �ndeksiniz:"+index);
	}

}
