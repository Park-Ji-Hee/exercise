import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a,b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int d = (b+c)/60;
		int e = (b+c)%60;
		
		
		if(b+c < 60) {
			System.out.println(a + " " + (b+c));
		} else {
			if(a+d < 24) {
				System.out.println((a+d) + " " +e);
			}  else {
				System.out.println((a+d-24) + " " + e);
			}
		}

	}

}
