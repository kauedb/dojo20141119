package dojo

import org.junit.Test
import org.testng.Assert

/**
 * Created by Kauê Q. Carbonari.
 */
class AlgarismoRomanoTeste {

    @Test
    public void dadoIRetornar1() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('I'), 1);
    }

    @Test
    public void dadoVRetornar5() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('V'), 5);
    }

    @Test
    public void dadoXRetornar10() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('X'), 10);
    }

    @Test
    public void dadoLRetornar50() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('L'), 50);
    }

    @Test
    public void dadoCRetornar100() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('C'), 100);
    }

    @Test
    public void dadoDRetornar500() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('D'), 500);
    }

    @Test
    public void dadoMRetornar1000() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('M'), 1000);
    }

    @Test
    public void dadoIIIRetornar3() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('III'), 3);
    }

    public void dadoXXXRetornar30() {
        AlgarismoRomano conversor = new AlgarismoRomanoImpl()
        Assert.assertEquals(conversor.paraArabico('XXX'), 30);
    }
}



