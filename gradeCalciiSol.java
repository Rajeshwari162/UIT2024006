package UIT2024006;
import org.junit.*;
public class gradeCalciiSol {
    @Test
    public void testAddition()
    {
        gradeCalcii m1=new gradeCalcii();
        Assert.assertEquals("O",m1.grade(90));
        Assert.assertEquals("D", m1.grade(40));
    }
}
