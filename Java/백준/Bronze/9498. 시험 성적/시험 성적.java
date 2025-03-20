import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		String r;
		switch(s/10) {
		case 10 : 
		case 9 : r="A"; break;
		case 8 : r="B"; break;
		case 7 : r="C"; break;
		case 6 : r="D"; break;
		default : r = "F";  
		}
		
		System.out.println(r);

	}

}