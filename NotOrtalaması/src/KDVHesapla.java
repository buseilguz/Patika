import java.util.Scanner;
public class KDVHesapla {

	public static void main(String[] args) {
		double para;
	
		Scanner inp=new Scanner(System.in);
		System.out.println("para değerini giriniz.");
		
		para=inp.nextDouble();
		
		if (para>0 && para<1000) {
			
			System.out.println("KDV Tutarı :" + para*0.18);
			System.out.println("KDV'li tutar :" + para*1.18);
		}
		else if(para>=1000){
			System.out.println("KDV Tutarı :" + para*0.08);
			System.out.println("KDV'li tutar :" + para*1.08);
		}

	}

}
