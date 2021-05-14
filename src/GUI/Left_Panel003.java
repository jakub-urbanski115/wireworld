package GUI;

import DMain.GM_lgen_loop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Left_Panel003 extends JPanel {

    private static Dimension dim2 = new Dimension(560, 720);

    public TextField_Lgen lgen = new TextField_Lgen();
    public Button_StartStop startStop = new Button_StartStop(2);
    public Path path = new Path();

    public Left_Panel003() {
        this.setPreferredSize(dim2);
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(0x22223D));
        this.setVisible(true);

        JLabel dimdes1 = new JLabel("Path of file");
        dimdes1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        dimdes1.setPreferredSize(new Dimension(500, 50));
        Left_Panel003.this.add(dimdes1);
        JLabel dimdes2 = new JLabel("Liczba generacji");
        dimdes2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        dimdes2.setPreferredSize(new Dimension(500, 50));
        Left_Panel003.this.add(dimdes2);

        this.add(dimdes1);
        this.add(path);
        this.add(dimdes2);
        this.add(lgen);
        this.add(startStop);
    }


}
