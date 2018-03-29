package kata.kyu4;

import java.util.HashMap;
import java.util.Map;

public class BattleShipsSunkDamagedOrNotTouched {
    private static final String SUNK = "sunk";
    private static final String DAMAGED = "damaged";
    private static final String NOT_TOUCHED = "notTouched";
    private static final String POINTS = "points";

    public static Map<String, Double> damagedOrSunk(final int[][] board, final int[][] attacks) {

        Map<Integer, Integer> shipsPre = new HashMap<>();
        Map<Integer, Integer> shipsPost = new HashMap<>();
        Map<String, Double> result = new HashMap<>();

        checkBoard(board, shipsPre);
        runAttacks(board, attacks);
        checkBoard(board, shipsPost);
        validateGame(shipsPre, shipsPost, result);
        calculatePoints(result);

        return result;
    }

    private static void calculatePoints(Map<String, Double> result) {
        result.put(SUNK, result.getOrDefault(SUNK, 0.0));
        result.put(DAMAGED, result.getOrDefault(DAMAGED, 0.0));
        result.put(NOT_TOUCHED, result.getOrDefault(NOT_TOUCHED, 0.0));
        result.put(POINTS, (result.getOrDefault(SUNK, 0.0) * 1.0) + (result.getOrDefault(DAMAGED, 0.0) * 0.5) + (result.getOrDefault(NOT_TOUCHED, 0.0) * -1.0));
    }

    private static void validateGame(Map<Integer, Integer> shipsPre, Map<Integer, Integer> shipsPost, Map<String, Double> result) {
        shipsPre.forEach((key, valPre) -> {
            Integer valPost = shipsPost.getOrDefault(key, 0);
            if (valPre == valPost) result.put(NOT_TOUCHED, 1 + result.getOrDefault(NOT_TOUCHED, 0.0));
            else if (valPost > 0) result.put(DAMAGED, 1 + result.getOrDefault(DAMAGED, 0.0));
            else if (valPost == 0) result.put(SUNK, 1 + result.getOrDefault(SUNK, 0.0));
        });
    }

    private static void runAttacks(int[][] board, int[][] attacks) {
        for (int[] attack : attacks) {
            board[board.length - attack[1]][attack[0] - 1] = 0;
        }
    }

    private static void checkBoard(int[][] board, Map<Integer, Integer> shipsPre) {
        for (int[] row : board) {
            for (int val : row) {
                if (val > 0) shipsPre.put(val, 1 + shipsPre.getOrDefault(val, 0));
            }
        }
    }
}
