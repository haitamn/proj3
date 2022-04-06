import org.junit.Assert;
import org.junit.Test;

public class MathTest {
    @Test
 public void sumTest() {
        int x = 12;
        int y = 55;
        int realAns = 67;
        Assert.assertEquals(67, y + x);
    }
    @Test
    public void MaxInMAthTest(){
        int x= Math.max(-155,0);
        Assert.assertEquals(0 ,x);

    }

}
