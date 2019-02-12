import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class DriverPrivateTest {


    @Test
    public void testsetDriverNum() throws Exception
    {
        System.out.println("setDriverNum");
        Driver target = new Driver("robbie",123);

        Method method = Driver.class.getDeclaredMethod("setDriverNum", int.class);

        method.setAccessible(true);
        method.invoke(target,120);

        Class secretClass = target.getClass();
        Field f = secretClass.getDeclaredField("driverNum");

        f.setAccessible(true);

        System.out.println("The value in f (driver number) is " + f.get(target));

        int result = f.getInt(target);
        assertEquals("The driver number should be equal to",120,result);

    }

}
