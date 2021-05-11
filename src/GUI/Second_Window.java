package GUI;

import javax.swing.*;
import java.awt.*;

import static GUI.First_Window.dim;

public class Second_Window extends JFrame {

    private Left_Panel pleft = new Left_Panel(2);
    private static RP_2D_wireworld_animation pright = new RP_2D_wireworld_animation(2);

    public Second_Window(){
        this.setPreferredSize(dim);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(pleft,BorderLayout.WEST);
        this.add(pright,BorderLayout.EAST);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

}
