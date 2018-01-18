package kata.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyMoneyMoneyTest {
    @Test
    public void test() {
        System.out.println("Fixed Tests calculateYears");
        assertEquals(3, MoneyMoneyMoney.calculateYears(1000, 0.05, 0.18, 1100));
        assertEquals(14, MoneyMoneyMoney.calculateYears(1000, 0.01625, 0.18, 1200));
        assertEquals(0, MoneyMoneyMoney.calculateYears(1000, 0.05, 0.18, 1000));
    }

}