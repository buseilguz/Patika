import java.util.Scanner;
public class EtkinlikOnerme {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		int weather;
		System.out.println("Hava sıcaklığını giriniz.");
		weather=scn.nextInt();
		if (weather<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		else if(weather>=5 && weather<15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		else if(weather>=15 && weather<25) {
			System.out.println("Pikniğe gidebilirsiniz.");
		}
		else if(weather>=25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}
	}

}
