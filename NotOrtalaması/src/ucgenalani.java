import java.util.Scanner;
public class ucgenalani {

	public static void main(String[] args) {

		int a,b,c;
		double u,alan;
		Scanner scn=new Scanner(System.in);
		System.out.println("Birinci kenar uzunluðunu giriniz.");
		a=scn.nextInt();
		System.out.println("Ýkinci kenar uzunluðunu giriniz.");
		b=scn.nextInt();
		System.out.println("Üçüncü kenar uzunluðunu giriniz.");
		c=scn.nextInt();
		
		u=(a+b+c)/2;
		
		alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Üçgenin alaný"+alan);
	}

}
