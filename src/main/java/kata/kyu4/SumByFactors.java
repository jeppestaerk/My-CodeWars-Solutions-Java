package kata.kyu4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumByFactors {
    public static String sumOfDivided(int[] l) {
        HashMap<Integer, Integer> results = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (Integer num : l) {
            for (Integer primeNum : primeFactors(num)) {
                if (!results.containsKey(primeNum)) {
                    results.put(primeNum, num);
                } else {
                    results.put(primeNum, results.get(primeNum) + num);
                }
            }
        }
        results.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> sb.append("(" + e.getKey() + " " + e.getValue() + ")"));
        return sb.toString();
    }

    private static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }
        return factors.stream().distinct().collect(Collectors.toList());
    }
}
