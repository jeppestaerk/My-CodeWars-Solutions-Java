package kata.kyu4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class SquareIntoSquaresProtectTrees {

    public String decompose(long n) {

        long nSquare = (long) Math.pow(n, 2);
        long sum = 0;
        List<Long> numbers = new ArrayList<>();

        System.out.println("---------------Init-------------");
        System.out.println("num: " + n + " rest: " + nSquare);
        System.out.println();
        System.out.println("---------------First------------");
        while (sum < nSquare && --n > 0) {
            long restSum = (nSquare - sum);
            long nextNum = nextNumber(restSum, n);
            if (!numbers.contains(nextNum)) {
                numbers.add(nextNum);
                long value = (long) Math.pow(nextNum, 2);
                n = nextNum;
                System.out.print("add: " + nextNum + " value: " + value + " old sum: " + sum + " old rest: " + restSum);
                sum += value;
                restSum = (nSquare - sum);
                System.out.println(" new sum: " + sum + " new rest: " + restSum);
            }
        }

        System.out.println("numbers = " + numbers + " sum: " + sum + " diff: " + (nSquare - sum));

        int index = numbers.size();
        int run = 1;
        while (sum != nSquare && index > 0) {
            System.out.println();
            System.out.println("---------------ReRun:" + (run++) + "----------");
            sum = 0;
            n = numbers.get(--index);
            numbers = numbers.subList(0, index);
            for (long num : numbers) sum += (long) Math.pow(num, 2);
            long rSum = (nSquare - sum);

            System.out.println("numbers = " + numbers + " sum: " + sum + " diff: " + rSum + " new n: " + --n);

            while (sum < nSquare && n > 0) {
                long nNum = nextNumber(rSum, n);
                if (!numbers.contains(nNum)) {
                    numbers.add(nNum);
                    long val = (long) Math.pow(nNum, 2);
                    n = nNum;
                    System.out.print("add: " + nNum + " value: " + val + " old sum: " + sum + " old rest: " + rSum);
                    sum += val;
                    rSum = (nSquare - sum);
                    System.out.println(" new sum: " + sum + " new rest: " + rSum);
                }
                n--;
            }
            if (index == 0) index = numbers.size();
            System.out.println("numbers = " + numbers + " sum: " + sum + " diff: " + (nSquare - sum));
        }

        sum = 0;
        for (long num : numbers) sum += (long) Math.pow(num, 2);
        System.out.println();
        System.out.println("---------------Final------------");
        System.out.println("numbers = " + numbers + " sum: " + sum + " diff: " + (nSquare - sum));
        System.out.println();
        System.out.println("================================");
        System.out.println();

        return (sum == nSquare) ? numbers.stream().sorted().map(d -> d.toString()).collect(Collectors.joining(" ")) : null;
    }

    private long nextNumber(long restSum, long n) {
        long tempSum = (long) Math.pow(n, 2);
        while (n > 0 && tempSum > restSum) tempSum = (long) Math.pow(--n, 2);
        return n;
    }
}
