package who.programador.projectone.calc;

import org.junit.Assert;
import org.junit.Test;

public class NumbersCalcTest {
    @Test
    public void testFindMax(){
        assert NumbersCalc.findMax(3, 7, 5) == 7;
        assert NumbersCalc.findMax(10, 10, 10) == 10;
        assert NumbersCalc.findMax(-1, 0, 1) == 1;
    }

    @Test
    public void testFindMaxReturnFalse(){
        Assert.assertNotEquals(5, NumbersCalc.findMax(3, 7, 5));
        Assert.assertNotEquals(3, NumbersCalc.findMax(3, 7, 5));
    }
}
