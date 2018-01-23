package kata.kyu4;

import java.util.ArrayList;
import java.util.List;

public class TenPinBowling {
    public static int bowling_score(String f) {
        Integer score = 0;
        List<Integer> rolls = new ArrayList<>();
        String[] frames = f.split(" ");
        for (String frame : frames) {
            String[] balls = frame.split("");
            for (String ball : balls) {
                if (ball.matches("X")) rolls.add(10);
                else if (ball.matches("/")) rolls.add(10 - rolls.get(rolls.size() - 1));
                else rolls.add(Integer.valueOf(ball));
            }
        }
        rolls.add(0);
        rolls.add(0);

        Integer frame = 0;
        for (int i = 0; i < 10; i++) {
            Integer point = rolls.get(frame);
            Integer nPoint = rolls.get(frame + 1);
            Integer nnPoint = rolls.get(frame + 2);
            if (point == 10) {
                score += 10 + (nPoint + nnPoint);
                frame++;
            } else if ((point + nPoint) == 10) {
                score += 10 + (nnPoint);
                frame += 2;
            } else {
                score += point + nPoint;
                frame += 2;
            }
        }

        return score;
    }
}
