package guru.springframework;

import com.springframework.Dollar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar proudct = five.times(2);
        Assertions.assertEquals(10,proudct.amount);
        proudct = five.times(3);
        Assertions.assertEquals(15,proudct.amount);
    }

}
