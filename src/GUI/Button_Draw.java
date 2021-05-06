package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static GUI.First_Window.dim;

public class Button_Draw extends JButton {

    public Button_Draw(){
        Color c001 = new Color(0x900E1B);
        this.setBackground(c001);
        this.setText("Draw");
        this.setHorizontalTextPosition(RIGHT);
        this.setVerticalAlignment(CENTER);
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        this.setPreferredSize(new Dimension(640,720));
        this.setFocusable(false);
        }


    public void second_window(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Second_Window window = new Second_Window();

            }
        });

    }

}
