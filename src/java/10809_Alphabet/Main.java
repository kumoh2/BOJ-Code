import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] first = FindFirstAtoZ(s);
        for (int i = 0; i < 26; i++) {
            System.out.print(first[i] + " ");
        }
        scanner.close();
    }

    static int[] FindFirstAtoZ(String s)
    {
        int[] cnt = new int[26]; // A ~ Z 의 첫번째 등장 위치 저장 배열

        for (int i = 0; i < cnt.length; i++)
            cnt[i] = -1; // cnt 배열 초기화

        for (int i = 0; i < s.length(); i++)
        {
            int idx = s.charAt(i) - 'a';
            if (cnt[idx] == -1)
            {
                cnt[idx] = i; // 해당 알파벳의 첫번째 등장 위치 저장
            }
        }

        return cnt;
    }
}