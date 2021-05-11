package GUI;

import javax.swing.*;
import java.awt.*;

public class Button_StartStop extends JButton {

    public Button_StartStop(int i){
        Color c001 = new Color(0x900E1B);
        this.setBackground(c001);
        this.setHorizontalTextPosition(RIGHT);
        this.setVerticalAlignment(CENTER);
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.setPreferredSize(new Dimension(500,100));
        this.setFocusable(false);
    }
}
