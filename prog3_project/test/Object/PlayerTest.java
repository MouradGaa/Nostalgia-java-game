package Object;

import GameMap.Game_Map;
import org.junit.* ;



public class PlayerTest{

    private Game_Map map = new Game_Map(32) ;
    private Player player = new Player(map) ;
    private book b = new book(map) ;
    private item it = new item(map) ;

    @Test
    public void testCollide_withBook()
    {
        boolean result = player.collide_with(b) ;
        Assert.assertEquals(true, result);
    }
    @Test
    public void testCollide_withItem()
    {
        boolean result = player.collide_with(it) ;
        Assert.assertEquals(true, result);
    }
}