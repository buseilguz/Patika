import java.util.Scanner;
public class ucgenalani {

	public static void main(String[] args) {

		int a,b,c;
		double u,alan;
		Scanner scn=new Scanner(System.in);
		System.out.println("Birinci kenar uzunlu�unu giriniz.");
		a=scn.nextInt();
		System.out.println("�kinci kenar uzunlu�unu giriniz.");
		b=scn.nextInt();
		System.out.println("���nc� kenar uzunlu�unu giriniz.");
		c=scn.nextInt();
		
		u=(a+b+c)/2;
		
		alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("��genin alan�"+alan);
	}

}
