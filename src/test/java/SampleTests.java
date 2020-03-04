import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class SampleTests {

    Sample sample = new Sample();

    @Test
    public void shouldCheckEquality(){

        Assert.assertEquals(false, sample.checkEquality());

    }

    @Test
    public void shouldCheckIdentity(){

        Assert.assertSame(true, sample.checkIdentity());
    }

    @Test
    public void shouldFail(){

        Assert.fail();
    }


    //This test will always failed :)
    @Test(timeout = 1000)
    public void infinity() {
        while (true) ;
    }

    @Ignore("Test is ignored as a demonstration")
    @Test
    public void testDisable() {
        Assert.assertNotNull( sample.a);
    }


}
