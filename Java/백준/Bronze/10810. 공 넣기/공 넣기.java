import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr = new int [n1];
        int n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();
            int n5 = sc.nextInt();

            for (int j = n3-1 ; j < n4 ; j++) {
                arr[j] = n5;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}