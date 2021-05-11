package GUI;

import javax.swing.*;
import java.awt.*;


public class Panel_add extends JPanel {

    private static Dimension dim2 = new Dimension(500,350);
    public static final Dimension dim3 = new Dimension(500,75);
    private final Button_dead dead= new Button_dead();
    private final Button_cable cable = new Button_cable();
    private final Button_electron_head electron_head = new Button_electron_head();
    private final Button_electron_tail electron_tail = new Button_electron_tail();
    private final JLabel label = new JLabel("ADD");

    public Panel_add (){
        this.setBackground(new Color(0x30306C));
        this.setPreferredSize(dim2);
        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(dead);
        this.add(cable);
        this.add(electron_head);
        this.add(electron_tail);
        this.setVisible(true);
    }


}
