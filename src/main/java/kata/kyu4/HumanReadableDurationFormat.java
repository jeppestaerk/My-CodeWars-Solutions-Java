package kata.kyu4;

public class HumanReadableDurationFormat {

    public static String formatDuration(int s) {

        int time = s;
        int years = s / 31536000;
        s -= years * 31536000;
        int days = s / 86400;
        s -= days * 86400;
        int hours = s / 3600;
        s -= hours * 3600;
        int minutes = s / 60;
        s -= minutes * 60;
        int seconds = s;

        StringBuilder sb = new StringBuilder();
        if (time == 0) sb.append("now");
        if (years > 0) {
            sb.append(years).append(" year");
            if (years > 1) sb.append("s");
            time -= years * 31536000;
            if (time > 0) sb.append(", ");
            else sb.append(" ");
        }
        if (days > 0) {
            sb.append(days).append(" day");
            if (days > 1) sb.append("s");
            time -= days * 86400;
            if (time > 0) sb.append(", ");
            else sb.append(" ");
        }
        if (hours > 0) {
            sb.append(hours).append(" hour");
            if (hours > 1) sb.append("s");
            time -= hours * 3600;
            if (time > 0) sb.append(", ");
            else sb.append(" ");
        }
        if (minutes > 0) {
            sb.append(minutes).append(" minute");
            if (minutes > 1) sb.append("s");
            time -= minutes * 60;
            if (time > 0) sb.append(", ");
            else sb.append(" ");
        }
        if (seconds > 0) {
            sb.append(seconds).append(" second");
            if (seconds > 1) sb.append("s");
        }
        if (sb.indexOf(",") > 0) sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, " and");

        return sb.toString().trim();
    }
}
