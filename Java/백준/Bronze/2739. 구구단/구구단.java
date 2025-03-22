import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n =sc.nextInt();
    	
    	int a=0;
    	while(a<9) {
    		a++;
    		System.out.printf("%d * %d = %d\n", n, a, n*a);
    	}  	

    }
}