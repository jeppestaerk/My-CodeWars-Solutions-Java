package kata.kyu4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BattleShipsSunkDamagedOrNotTouched {

    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {
        Map<String, Double> result = new HashMap<String, Double>();
        System.out.println("board = [" + Arrays.deepToString(board) + "], attacks = [" + Arrays.deepToString(attacks) + "]");
        System.out.println("x.len = " + board[0].length + " y.len = " + board.length);
        int xOffset = 1;
        int yOffset = board.length;
        System.out.println("xOffset = " + xOffset);
        System.out.println("yOffset = " + yOffset);
        int ship1 = 0;
        int ship1hits = 0;
        int ship2 = 0;
        int ship2hits = 0;
        int ship3 = 0;
        int ship3hits = 0;
        int ships = 0;
        double sunk = 0.0;
        double damaged = 0.0;
        double notTouched = 0.0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) ship1++;
                else if (board[i][j] == 2) ship2++;
                else if (board[i][j] == 3) ship3++;
            }
        }
        if (ship1 > 0) ships++;
        if (ship2 > 0) ships++;
        if (ship3 > 0) ships++;

        System.out.println("ship1 = " + ship1);
        System.out.println("ship2 = " + ship2);
        System.out.println("ship3 = " + ship3);
        System.out.println("ships = " + ships);

        for (int i = 0; i < attacks.length; i++) {
            System.out.println("Attack: " + attacks[i][0] + ", " + attacks[i][1]);
            int x = attacks[i][0] - xOffset;
            int y = yOffset - attacks[i][1];
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            int hit = board[y][x];
            System.out.println("hit = " + hit);

            if (hit == 1) ship1hits++;
            if (hit == 2) ship2hits++;
            if (hit == 3) ship3hits++;
        }

        if (ship1 > 0 && ship1hits > 0 && ship1hits < ship1) damaged++;
        if (ship1 > 0 && ship1hits > 0 && ship1hits == ship1) sunk++;
        if (ship1 > 0 && ship1hits == 0) notTouched++;

        if (ship2 > 0 && ship2hits > 0 && ship2hits < ship2) damaged++;
        if (ship2 > 0 && ship2hits > 0 && ship2hits == ship2) sunk++;
        if (ship2 > 0 && ship2hits == 0) notTouched++;

        if (ship3 > 0 && ship3hits > 0 && ship3hits < ship3) damaged++;
        if (ship3 > 0 && ship3hits > 0 && ship3hits == ship3) sunk++;
        if (ship3 > 0 && ship3hits == 0) notTouched++;

        result.put("sunk", sunk);
        result.put("damaged", damaged);
        result.put("notTouched", notTouched);
        result.put("points", (sunk * 1.0) + (damaged * 0.5) + (notTouched * -1.0));

        return result;
    }
}
