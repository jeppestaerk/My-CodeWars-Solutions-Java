package kata.kyu4;

public class LongestCommonSubsequencePerformanceVersion {

    static String lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        return lcs(a, b, m, n);
    }

    static String lcs(String x, String y, int m, int n) {
        int[][] l = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    l[i][j] = 0;
                else if (x.charAt(i - 1) == y.charAt(j - 1))
                    l[i][j] = l[i - 1][j - 1] + 1;
                else
                    l[i][j] = Math.max(l[i - 1][j], l[i][j - 1]);
            }
        }

        int index = l[m][n];
        int temp = index;

        char[] lcs = new char[index + 1];
        lcs[index] = '\0';

        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                lcs[index - 1] = x.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (l[i - 1][j] > l[i][j - 1])
                i--;
            else
                j--;
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k <= temp; k++) {
            sb.append(lcs[k]);
        }

        return sb.deleteCharAt(temp).toString();
    }
}
