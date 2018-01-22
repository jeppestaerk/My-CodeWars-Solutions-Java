package kata.kyu4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareIntoSquaresProtectTrees {

    @SuppressWarnings("Duplicates")
    public String decompose(long n) {

        long nSquare = (long) Math.pow(n, 2);
        long sum = 0;
        List<Long> numbers = new ArrayList<>();

        while (sum < nSquare && --n > 0) {
            long restSum = (nSquare - sum);
            long nextNum = nextNumber(restSum, n);
            if (!numbers.contains(nextNum)) {
                numbers.add(nextNum);
                n = nextNum;
                sum += (long) Math.pow(nextNum, 2);
            }
        }

        int index = numbers.size();
        while (sum != nSquare && index > 0) {
            sum = 0;
            n = numbers.get(--index);
            numbers = numbers.subList(0, index);
            for (long num : numbers) sum += (long) Math.pow(num, 2);

            while (sum < nSquare && --n > 0) {
                long restSum = (nSquare - sum);
                long nextNum = nextNumber(restSum, n);
                if (!numbers.contains(nextNum)) {
                    numbers.add(nextNum);
                    n = nextNum;
                    sum += (long) Math.pow(nextNum, 2);
                }
            }
            if (index == 0) index = numbers.size();
        }

        sum = 0;
        for (long num : numbers) sum += (long) Math.pow(num, 2);

        return (sum == nSquare) ? numbers.stream().sorted().map(Object::toString).collect(Collectors.joining(" ")) : null;
    }

    private long nextNumber(long restSum, long n) {
        long tempSum = (long) Math.pow(n, 2);
        while (n > 0 && tempSum > restSum) tempSum = (long) Math.pow(--n, 2);
        return n;
    }
}
