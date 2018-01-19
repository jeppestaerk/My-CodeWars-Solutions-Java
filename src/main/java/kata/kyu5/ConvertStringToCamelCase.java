package kata.kyu5;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        String camelCase = words[0];
        for (int i = 1; i < words.length; i++)
            camelCase = camelCase + words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        return camelCase;
    }
}
