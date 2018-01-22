package kata.kyu5;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++)
            sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
        return sb.toString();
    }
}
