import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (b >= 45) {System.out.println(a + " " + (b-45));}
        else {
            if (a> 0){System.out.println((a-1) + " " + (15+b));}
            else {System.out.println("23" + " " + (15+b));}
        } 
	}

}