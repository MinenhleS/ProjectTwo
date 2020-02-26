import org.junit.Assert;
import org.junit.Test;

public class PersonTests {



    @Test
    public void shouldCheckObject(){
        Person person1 = new Person();


        Assert.assertEquals(person1,person1.checking());

    }


}
