import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  
        int[] a = new int[t];  
        int cnt = 0;


        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        for (int i = 0; i < t; i++) {
            if (a[i] == b) {
                 cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}