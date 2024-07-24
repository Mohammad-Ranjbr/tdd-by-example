package guru.springframework;

import com.springframework.Dollar;
import com.springframework.Franc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar proudct = five.times(2);
        Assertions.assertEquals(new Dollar(10),proudct);
        proudct = five.times(3);
        Assertions.assertEquals(new Dollar(15),proudct);
    }

    @Test
    void testEqualityDollar() {
        Assertions.assertEquals(new Dollar(5),new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5),new Dollar(8));
    }

    @Test
    void testMultiplicationFranc() {
        Franc five = new Franc(5);
        Franc proudct = five.times(2);
        Assertions.assertEquals(new Franc(10),proudct);
        proudct = five.times(3);
        Assertions.assertEquals(new Franc(15),proudct);
    }

    @Test
    void testEqualityFranc() {
        Assertions.assertEquals(new Franc(5),new Franc(5));
        Assertions.assertNotEquals(new Franc(5),new Franc(8));
    }

}
