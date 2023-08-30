package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class DIceTest {
    @Test
    @DisplayName("Dice 객체 생성 테스트")
    void diceCOnstructorTest() {
        Dice dice = new Dice(4);
        Assertions.assertEquals(4, dice.getNumber());

    }

    @Test
    @DisplayName("Dice 객체 생성 반복 테스트")
    void diceIteratorTest() {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            Dice dice = new Dice(arr[i]);

            Assertions.assertEquals(arr[i], dice.getNumber());
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    @DisplayName("Dice 객체 생성 반복 테스트")
    void diceParamTest(int number) {
        Dice dice = new Dice(number);
        Assertions.assertEquals(number, dice.getNumber());
    }

    @Test
    @DisplayName("Dice 객체 생성 테스트(number : -1)")
    void negativeDiceConstructorTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(-1));
    }

    @Test
    @DisplayName("Dice 객체 생성 테스트(number : 7)")
    void overSixDice() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Dice(7));
    }

}
