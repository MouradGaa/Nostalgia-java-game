package GameState;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

// load all the content used in the game
public class content{

    public static BufferedImage[][] player = load("/playertest.gif", 32, 32); // player tileset
    public static BufferedImage[][] book = load("/book.png",32,32); //
    public static BufferedImage[][] key = load("/key.png",32,32) ;
    public static BufferedImage[][] axe = load("/axe.png",32,32) ;
    public static BufferedImage[][] ui = load("/ui.gif",214,32) ;
    public static BufferedImage[][] bme_logo = load("/credit.gif",214,116) ;

    // audio
    public static String menu_sound = "src/switch.wav";
    public static String bgMenu_sound = "src/bgMusic.wav";
    public static String select_sound = "audio/select.wav" ;
    public static String play_sound = "audio/play_music.wav" ;
    public static String key_sound = "audio/key_pickup.wav" ;
    public static String door_sound = "audio/open_door.wav" ;
    public static String book_sound = "audio/book.wav" ;
    // loads and image and store into matrix of images(useful for loading the player tileset mainly)
    public static BufferedImage[][] load(String s, int w, int h)
    {
        BufferedImage[][] res;
        try {
            BufferedImage img = ImageIO.read(content.class.getResourceAsStream(s)); // read the image
            int width = img.getWidth()/w; // the width of a single tile
            int height = img.getHeight()/h ; // the height of a single tile
            res = new BufferedImage[height][width]; // create new matrix of images to store the tiles
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    res[i][j] = img.getSubimage(j * w, i * h, w, h); // store the tiles intro the matrix
                }
            }
            return res;
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("loading failed");
        }
        return null;
    }

    }