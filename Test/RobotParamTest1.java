import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class RobotParamTest1 {

    private double expected;
    private int age;


    public RobotParamTest1( int age, double expected){
        this.age = age;
        this.expected = expected;
    }


    @Parameterized.Parameters (name= "{index}: checkCost({1})={0}")
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
                {5, 500},
                {10 , 1000},
                {15 , 8500},
                {125500 , 20},
                {61260 , 25},
                {251251200 , 30},

        });
    }


    @Test
    public void testcheckageAll() {
        Robot buddy = new Robot("buddy", age);
        assertEquals(expected, buddy.checkCost(),0.00);

    }
}
