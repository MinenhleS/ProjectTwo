import org.junit.Assert;
import org.junit.Test;

public class PersonTests {



    @Test
    public void shouldCheckObject(){
        Sample sample = new Sample();
        Person person1 = new Person();
        sample.person = person1;

        Assert.assertEquals(person1,sample.checking());

    }

    @Test
    public void shouldCheckObjectIdentity(){
        Sample sample = new Sample();
        Person person1 = new Person();
        sample.person = person1;

        Assert.assertSame(person1,sample.checking());

    }


}
