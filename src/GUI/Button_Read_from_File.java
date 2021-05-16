package GUI;

import javax.swing.*;
import java.awt.*;



public class Button_Read_from_File extends JButton {

    public Button_Read_from_File(){
        Color c001 = new Color(0x073884);
        this.setBackground(c001);
        this.setText("Read from File");
        this.setHorizontalTextPosition(LEFT);
        this.setVerticalAlignment(CENTER);
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.setPreferredSize(new Dimension(640,720));
        this.setFocusable(false);

    }

}
