package kata.kyu7;

public class JadenCasingStrings {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;
        StringBuilder jadenCase = new StringBuilder();
        for (String word : phrase.split(" ")) {
            jadenCase.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        return jadenCase.toString().trim();
    }
}
