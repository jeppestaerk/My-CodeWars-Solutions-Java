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
        time = processYears(time, years, sb);
        time = processDays(time, days, sb);
        time = processHours(time, hours, sb);
        time = processMinutes(time, minutes, sb);
        time = processSeconds(time, seconds, sb);
        if (sb.indexOf(",") > 0) sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, " and");

        return sb.toString().trim();
    }

    private static int processSeconds(int time, int seconds, StringBuilder sb) {
        if (seconds > 0) {
            sb.append(seconds).append(" second");
            appendS(seconds, sb);
            time -= seconds;
        }
        return time;
    }

    private static int processMinutes(int time, int minutes, StringBuilder sb) {
        if (minutes > 0) {
            sb.append(minutes).append(" minute");
            appendS(minutes, sb);
            time -= minutes * 60;
            postfix(time, sb);
        }
        return time;
    }

    private static void appendS(int count, StringBuilder sb) {
        if (count > 1) sb.append("s");
    }

    private static void postfix(int time, StringBuilder sb) {
        if (time > 0) sb.append(", ");
        else sb.append(" ");
    }

    private static int processHours(int time, int hours, StringBuilder sb) {
        if (hours > 0) {
            sb.append(hours).append(" hour");
            appendS(hours, sb);
            time -= hours * 3600;
            postfix(time, sb);
        }
        return time;
    }

    private static int processDays(int time, int days, StringBuilder sb) {
        if (days > 0) {
            sb.append(days).append(" day");
            appendS(days, sb);
            time -= days * 86400;
            postfix(time, sb);
        }
        return time;
    }

    private static int processYears(int time, int years, StringBuilder sb) {
        if (years > 0) {
            sb.append(years).append(" year");
            appendS(years, sb);
            time -= years * 31536000;
            postfix(time, sb);
        }
        return time;
    }
}
