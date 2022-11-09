import java.util.Scanner;
public class dairedilim {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		double r,a,dilim_alan;
		double pi=3.14;
		System.out.println("Yarýçap deðerini giriniz.");
		r=scn.nextDouble();
		
		System.out.println("Açýnýn ölçüsünü giriniz.");
		a=scn.nextDouble();
		
		dilim_alan=(pi*(r*r)*a)/360;
		
		System.out.println("Daire diliminin alaný :" +dilim_alan);
		
	}

}
