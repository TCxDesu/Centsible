package centsible.components;

import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import javax.swing.JPanel;

public class CustomFont {

    String location;
    Font customFont;

    public CustomFont() {
        getLocation();

        try {
            //create the font to use. Specify the size!
            customFont = Font.createFont(Font.TRUETYPE_FONT,
                    new File(location + "ITC Souvenir Light Regular.otf"))
                    .deriveFont(18f);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFont(JPanel panel, int size) {
        customFont = customFont.deriveFont(size);
        for (Component cp : panel.getComponents()) {
            cp.setFont(customFont);
        }
    }

    public void setFont(Component c, int size) {
        customFont = customFont.deriveFont(1,size);
        c.setFont(customFont);

    }

    public void getLocation() {
        File file = new File("");
        location = file.getAbsolutePath() + "\\src\\font\\";//setting file loc.
    }
}
