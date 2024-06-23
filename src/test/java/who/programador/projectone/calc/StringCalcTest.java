package who.programador.projectone.calc;

import org.junit.Test;

public class StringCalcTest {
    @Test
    public void testCountVowels() {
        StringCalc calc = new StringCalc();
        assert calc.countVowels("hello") == 2;
    }

    @Test
    public void testCountVowelsFalse(){
        StringCalc calc = new StringCalc();
        assert calc.countVowels("hello") != 3;
    }
}
