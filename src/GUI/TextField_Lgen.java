package GUI;

import javax.swing.*;
import java.awt.*;

public class TextField_Lgen extends JTextField {
    public TextField_Lgen (){
        Color c001 = new Color(0xD7B9B9);
        this.setBackground(c001);
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.setPreferredSize(new Dimension(500,50));
    }
}
