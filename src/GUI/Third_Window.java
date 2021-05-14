package GUI;

import javax.swing.*;
import java.awt.*;


public class Third_Window extends JFrame {
    private static final int flag = 3;
    private static final Left_Panel pleft = new Left_Panel(flag);
    private static final RP_2D_wireworld_animation pright = new RP_2D_wireworld_animation(flag);

    public Third_Window() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(pleft, BorderLayout.WEST);
        this.add(pright, BorderLayout.EAST);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
}
