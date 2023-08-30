package test;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

public class DiceCalculatorTest {
    /**
     *
     */
    @Test
    @DisplayName("as")
    void diceAddTest(int furst, int second, int result) {
        Dice firsrDice = new Dice(furst);
        Dice secondDice = new Dice(second);

        Assertions.assertEquals(result, DiceCalculator.addDice(firsrDice, secondDice));
    }

    @Test
    @DisplayName("DiceCalculator.getIndexOf 테스트")
    void getIndexOfTest() {
        Dice dice = new Dice(5);
        String str = "a1b1c3d4";

        Assertions.assertEquals("a1b1c3", DiceCalculator.getIndexOf(str, dice.getNumber()));
    }

    static Stream<Arguments> diceValue() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(4, 5, 9),
                Arguments.of(6, 6, 12)
        );
    }

    @Test
    @DisplayName("DiceCalculator.odd Test")
    void oddTest() {
        Dice dice = new Dice(2);
        Dice dice2 = new Dice(2);
        Assertions.assertFalse(DiceCalculator.odd(dice));
        Assertions.assertTrue(DiceCalculator.odd(dice2));

    }

}
