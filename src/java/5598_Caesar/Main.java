import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] encrypted = CaesarDecrypt(input);
        System.out.println(new String(encrypted));
        scanner.close();
    }

    static char[] CaesarDecrypt(String s)
    {
        char[] decryptString = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
        {
            decryptString[i] = (char)(s.charAt(i) - 3);

            if( decryptString[i] < 'A' )
            {
                decryptString[i] = (char)(decryptString[i] + 26);
            }
        }

        return decryptString;
    }
}