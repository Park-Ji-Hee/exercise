import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int []arr = new int[a];
        
        for(int i = 0 ; i < a; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int max, min;
        min = max = arr[0];
        for(int j = 0; j < a; j++) {
        	if(arr[j] > max) {
        		max = arr[j];
        	}
        	
        	if(arr[j] < min) {
        		min = arr[j];
        	}
        }
        
        System.out.print(min + " " + max);

        sc.close();
    }
}