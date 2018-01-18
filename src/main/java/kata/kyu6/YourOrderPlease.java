package kata.kyu6;

public class YourOrderPlease {
    public static String order(String words) {
        String[] strarr = words.split(" ");
        String result = "";
        for (int i = 1; i <= strarr.length; i++) {
            for (String str : strarr) {
                if (str.contains(Integer.toString(i))) result = result + str + " ";
            }
        }
        return result.trim();
    }
}
