import java.util.Scanner;
public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int n = 1 ; n <= t ; n++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", n, a, b, a+b);
		}
		sc.close();
	}
}