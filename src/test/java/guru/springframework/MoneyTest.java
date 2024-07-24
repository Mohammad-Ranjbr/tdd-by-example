package guru.springframework;

import com.springframework.Bank;
import com.springframework.Expression;
import com.springframework.Money;
import com.springframework.Sum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Money five = Money.dollar(5);
        Assertions.assertEquals(Money.dollar(10),five.times(2));
        Assertions.assertEquals(Money.dollar(15),five.times(3));

        Money fiveF = Money.franc(5);
        Assertions.assertEquals(Money.franc(10),fiveF.times(2));
    }

    @Test
    void testEquality() {
        Assertions.assertEquals(Money.dollar(5),Money.dollar(5));
        Assertions.assertNotEquals(Money.dollar(5),Money.dollar(8));
        Assertions.assertEquals(Money.franc(5),Money.franc(5));
        Assertions.assertNotEquals(Money.dollar(5),Money.franc(5));
    }

    @Test
    void testCurrency() {
        Assertions.assertEquals("USD",Money.dollar(1).currency());
        Assertions.assertEquals("CHF",Money.franc(1).currency());
    }

    @Test
    void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum,"USD");
        Assertions.assertEquals(Money.dollar(10),reduced);
    }

    @Test
    void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        Assertions.assertEquals(five,sum.augment);
        Assertions.assertEquals(five,sum.addend);
    }

    @Test
    void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum,"USD");
        Assertions.assertEquals(Money.dollar(7),result);
    }

    @Test
    void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1),"USD");
        Assertions.assertEquals(Money.dollar(1),result);
    }

}
