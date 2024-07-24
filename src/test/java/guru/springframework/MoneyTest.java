package guru.springframework;

import com.springframework.Dollar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar proudct = five.times(2);
        Assertions.assertEquals(new Dollar(10),proudct);
        proudct = five.times(3);
        Assertions.assertEquals(new Dollar(15),proudct);
    }

    @Test
    void testEquality() {
        Assertions.assertEquals(new Dollar(5),new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5),new Dollar(8));
    }

}
