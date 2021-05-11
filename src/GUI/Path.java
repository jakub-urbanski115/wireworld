package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Path extends JButton {


    public Path() {
        Color c001 = new Color(0x900E1B);
        this.setBackground(c001);
        this.setText("Select_Path");
        this.setHorizontalTextPosition(RIGHT);
        this.setVerticalAlignment(CENTER);
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.setPreferredSize(new Dimension(500,50));
        this.setFocusable(false);
    }
}