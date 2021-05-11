package GUI;

import javax.swing.*;
import java.awt.*;

public class Button_Confirm extends JButton {

    public Button_Confirm (){
        Color c001 = new Color(0x900E1B);
        this.setBackground(c001);
        this.setText("Confirm");
        this.setHorizontalTextPosition(RIGHT);
        this.setVerticalAlignment(CENTER);
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.setPreferredSize(new Dimension(500,50));
        this.setFocusable(false);

    }

}
