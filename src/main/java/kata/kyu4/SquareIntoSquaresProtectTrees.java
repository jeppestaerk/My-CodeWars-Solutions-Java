package kata.kyu4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareIntoSquaresProtectTrees {

    public String decompose(long n) {

        int index;
        List<Long> numbers = new ArrayList<>();
        long nSquare = (long) Math.pow(n, 2);
        long sum = fillList(n, nSquare, 0, numbers);
        index = numbers.size();
        while (sum != nSquare && index > 0) {
            n = numbers.get(--index);
            numbers = numbers.subList(0, index);
            sum = getSum(numbers);
            sum = fillList(n, nSquare, sum, numbers);
            if (index == 0) index = numbers.size();
        }
        return (getSum(numbers) == nSquare) ? numbers.stream().sorted().map(Object::toString).collect(Collectors.joining(" ")) : null;
    }

    private long fillList(long n, long nSquare, long sum, List<Long> numbers) {
        while (sum < nSquare && --n > 0) {
            long nextNum = nextNumber((nSquare - sum), n);
            numbers.add(nextNum);
            n = nextNum;
            sum += (long) Math.pow(nextNum, 2);
        }
        return sum;
    }

    private long getSum(List<Long> numbers) {
        long sum = 0;
        for (long num : numbers) sum += (long) Math.pow(num, 2);
        return sum;
    }
    private long nextNumber(long restSum, long n) {
        long tempSum = (long) Math.pow(n, 2);
        while (n > 0 && tempSum > restSum) tempSum = (long) Math.pow(--n, 2);
        return n;
    }
}
