package kata.kyu4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfProperFractionsWithDenominatorD {

    public static long properFractions(long n) {
        if (n == 1) return 0;
        long c = n;
        List<Long> pfs = primeFactors(n);
        for (long pf : pfs) c -= c / pf;
        return c;
    }

    private static List<Long> primeFactors(long numbers) {
        long n = numbers;
        List<Long> factors = new ArrayList<>();
        for (long i = 2; i <= n / i; i++)
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        if (n > 1) factors.add(n);
        return factors.stream().distinct().sorted().collect(Collectors.toList());
    }
}
