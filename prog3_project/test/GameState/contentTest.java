package GameState;

import org.junit.* ;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized ;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class contentTest {
    int x ;
    int w ;
    int h ;
    String s ;
    content cont ;

    public contentTest(String s, int w, int h,int x)
    {
        this.h = h ;
        this.w = w ;
        this.s = s ;
        this.x = x ;
    }
    @Before
    public void init()
    {
      cont = new content() ;

    }
    @Test
    public void test_load1()
    {
        int result = cont.load(s,w,h).length ;
        Assert.assertEquals(x,result,0);
    }
    @Test
    public void test_load2()
    {
        for(int i = 0 ; i<cont.load(s,w,h).length;i++)
        {
        int result = cont.load(s,w,h)[i].length ;
        Assert.assertEquals(x,result,0);
        }
    }
    @Parameters
    public static List<Object[]> parameters()
    {
        List<Object[]> params = new ArrayList<Object[]>() ;
        params.add(new Object[] {"/playertest.gif",32,32,4}) ;
        params.add(new Object[] {"/book.png",32,32,1}) ;
        params.add(new Object[] {"/ui.gif",214,32,1}) ;
        params.add(new Object[] {"/credit.gif",214,116,1}) ;
        return params ;
    }

}