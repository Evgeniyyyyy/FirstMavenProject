import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void test(){
        Assert.assertEquals(
                Main.pad("Yevhen", 10, "!"),
                "Yevhen!!!!");
    }
    @Test
    public void nullTest(){
        Assert.assertNull(
        null == Main.pad(null, 10, ""));
    }
    @Test
    public void emptyStrTest(){
        Assert.assertEquals(
                Main.pad("", 10, ""),
                "");
    }
}
