package UIT2024006;
import org.junit.*;
public class SortTest {
    @Test
    public void testAddition()
    {
        Sort m1=new Sort();
        Assert.assertEquals(30,m1.addition(10, 20));
        Assert.assertNotEquals(40, m1.addition(20,10));
    }
}
