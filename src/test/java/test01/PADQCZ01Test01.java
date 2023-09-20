package test01;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;

//@RunWith(MockitoJUnitRunner.class)
public class PADQCZ01Test01 {


    @Before
    public void setUp() {
        console("");
        console("****************");
        console("*** setUp -> ***");
        console("****************");
        console("");

    }
    @After
    public void tearDown() {
        console("");
        console("*******************");
        console("*** Test Ok! :) ***");
        console("*******************");
        console("");

    }
    @Test
    public void executeTest01(){

        console("");
        console("*******************");
        console("*** Test 01    ***");
        console("*******************");
        console("");
        //Assert -> afirmar

        assertEquals(true,true);
        assertEquals(false,false);

        assertNotEquals(true,false);
        assertNotEquals(false,true);

        String strNull = null;
        assertNull(strNull);

        String strNotNull = "***";
        assertNotNull(strNotNull);

        String strValor = anyString();
        assertNotNull(strValor);

        int intValor = anyInt();
        assertEquals(0,intValor);

        int int01 = anyInt();
        int int02 = anyInt();
        assertEquals(int01 * int02,intValor);

        assertFalse (false);
        assertTrue (true);

        assertSame(strNotNull,strNotNull);
        assertSame(true,true);

        Object a = null;
        Object b = null;
        assertEquals(a,b);
    }

    @Ignore
    @Test
    public void executeTest02(){
        console("");
        console("*******************");
        console("*** Test 02    ***");
        console("*******************");
        console("");
    }
    @Ignore
    @Test
    public void executeTest03(){


        console("");
        console("*******************");
        console("*** Test 03    ***");
        console("*******************");
        console("");

    }

    @Test
    public void executeTest04(){

        console("");
        console("*******************");
        console("*** Test 04    ***");
        console("*******************");
        console("");

        long v = 1000;
        for (long i = 0 ; i <= v ; i++ ){
            for (long j = 0 ; j <= v ; j++ ){

            }
        }

    }

    @Test
    public void executeTest05() throws Exception {

        console("");
        console("*******************");
        console("*** Test 05    ***");
        console("*******************");
        console("");

        try {
            int x = 0/0;
            fail();
        } catch (Exception e) {
            console("Error -> " + e.getMessage() + " !");
        }


    }
    @Test
    public void executeTest06() {

        console("");
        console("*******************");
        console("*** Test 06    ***");
        console("*******************");
        console("");

        long v = 1000;
        for (long i = 0 ; i <= v ; i++ ){
            assertEquals(i,i);
        }
    }

    void console(String x){
        System.out.println(x);
    }
}
