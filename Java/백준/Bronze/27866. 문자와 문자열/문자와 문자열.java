import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        String str = scanner.nextLine();
        int num = scanner.nextInt();

        char point = str.charAt(num-1);

        System.out.println(point);
    }
}