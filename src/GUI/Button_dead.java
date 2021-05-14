package GUI;

import javax.swing.*;
import java.awt.*;

import static GUI.Panel_add.dim3;

public class Button_dead extends JButton {


    public Button_dead (){
        Color c001 = new Color(0x900E1B);
        this.setBackground(c001);
        this.setText("Dead");
        this.setHorizontalTextPosition(RIGHT);
        this.setVerticalAlignment(CENTER);
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.setPreferredSize( dim3);
        this.setFocusable(false);
    }
}
