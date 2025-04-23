import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input scanner a b
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //output the sum
        System.out.println(a + b);
        scanner.close();
    }
}