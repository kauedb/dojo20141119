package helloworld;

import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void testSayHello(){
        final Greeter greeter = new Greeter();
        Object result = greeter.sayHello("world");
        Assert.assertEquals(result.toString(), "hello world");
    }

    @Test
    public void testSayBye(){
        final Greeter greeter = new Greeter();
        Object result = greeter.sayBye("world");
        Assert.assertEquals(result.toString(), "bye world");
    }

    @Test
    public void test0(){
        Assert.assertTrue(false);
    }

    @Test
    public void test1(){
        Assert.assertTrue(true);
    }


}