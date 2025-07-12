using System;

class MainClass
{
    public static void Main(string[] args)
    {
        string input = Console.ReadLine();
        char[] encrypted = CaesarEncrypt(input);
        Console.WriteLine(string.Join("", encrypted));
    }

    static char[] CaesarEncrypt(string s)
    {
        char[] encryptString = new char[s.Length];

        for (int i = 0; i < s.Length; i++)
        {
            encryptString[i] = (char)(s[i] - 3);
        }

        return encryptString;
    }
}