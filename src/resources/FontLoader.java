package resources;

import java.awt.*;
import java.io.InputStream;

public class FontLoader {

    public static Font titleFont(float size) {
        try {
            InputStream is = FontLoader.class.getResourceAsStream("/resources/fonts/Poppins-Bold.ttf");
            Font baseFont = Font.createFont(Font.TRUETYPE_FONT, is);
            return baseFont.deriveFont(size);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new Font("SansSerif", Font.PLAIN, (int) size);
        }
    }
}
