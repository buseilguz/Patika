import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		double number1, number2, result = 0 ;
		String operation;
		System.out.println("Birinci sayıyı giriniz.");
		number1=scn.nextDouble();
		System.out.println("İkinci sayıyı giriniz.");
		number2=scn.nextDouble();
		
		System.out.println("Yapılacak işlemi giriniz. (+,-,*,/)");
		operation=scn.next();
			
		switch (operation) {
		case "+":
			result=number1+number2;
			
			break;
		case "-":
			
			result=number1-number2;
		
			break;
		case "*":
			result=number1*number2;
			
			break;
		case "/":
			result=number1/number2;
			
			break;
		default:
			System.out.println("Lütfen geçerli bir operatör giriniz.");
		}
		System.out.println("İşlem sonucu :"+result);

	}

}
