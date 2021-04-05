package GameMap;

import org.junit.* ;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized ;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class Game_MapTest  {
    int r ;
    int c ;
    int x ;
    Game_Map map ;
    public Game_MapTest(int r, int c,int x)
    {
        this.r = r ;
        this.c = c ;
        this.x= x ;
    }
    @Before
    public void init()
    {
       map = new Game_Map(32) ;
       map.load_tiles("/tilesfinal.png");
       map.load_map("/tile_text.txt");
    }


    @Test
    public void test_getType()
    {
        int result = map.getType(r,c) ;
        Assert.assertEquals(x,result,0);
    }
    @Parameters
    public static List<Object[]> parameters()
    {
        List<Object[]> params = new ArrayList<Object[]>() ;
        params.add(new Object[] {0,0,Tile.blocked}) ;
        params.add(new Object[] {3,1,Tile.blocked}) ;
        params.add(new Object[] {2,2,Tile.normal}) ;
        params.add(new Object[] {3,6,Tile.normal}) ;
        return params ;
    }
}