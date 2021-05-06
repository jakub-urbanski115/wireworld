package GUI;

import javax.swing.*;
import java.awt.*;

import static GUI.First_Window.dim;

public class Second_Window extends JFrame {

    private static final int flag = 2;
    private static final Left_Panel pleft = new Left_Panel(flag);
    private static final RP_2D_wireworld_animation pright = new RP_2D_wireworld_animation(flag);

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
