using System;

class Program {
    static void Main(string[] args)
    {
        string s = Console.ReadLine().Trim();
        int[] first = FindFirstAtoZ(s);
        Console.WriteLine(string.Join(' ', first));
    }

    /* 알파벳 A ~ Z 중 처음 등장하는 위치 */
    static int[] FindFirstAtoZ(string s)
    {
        var cnt = new int[26]; // A ~ Z 의 첫번째 등장 위치 저장 배열

        for (int i = 0; i < cnt.Length; i++)
            cnt[i] = -1; // cnt 배열 초기화

        for (int i = 0; i < s.Length; i++)
        {
            if (cnt[s[i] - 'a'] == -1)
            {
                cnt[s[i] - 'a'] = i; // 해당 알파벳의 첫번째 등장 위치 저장
            }
        }

        return cnt;
    }
}