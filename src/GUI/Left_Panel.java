package GUI;

import javax.swing.*;
import java.awt.*;


public class Left_Panel extends JPanel {

    private static Dimension dim2 = new Dimension(560, 720);

    public Left_Panel(int f) {
        if (f == 2) {
            set_buttons2();
        } else set_buttons1();
        this.setPreferredSize(dim2);
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(0x22223D));
        this.setVisible(true);


    }


    private void set_buttons1() {

        Button_Confirm bconfirm = new Button_Confirm();
        TextField_Dim tfDim = new TextField_Dim();
        Button_StartStop startStop = new Button_StartStop(1);
        Panel_add padd = new Panel_add();
        JLabel dimdes = new JLabel("Podaj rozmiar mapy");
        dimdes.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        dimdes.setPreferredSize(new Dimension(500, 50));
        Left_Panel.this.add(dimdes);
        this.add(tfDim);
        this.add(bconfirm);
        this.add(padd);
        this.add(startStop);
    }

    private void set_buttons2() {
        JLabel dimdes1 = new JLabel("Path of file");
        dimdes1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        dimdes1.setPreferredSize(new Dimension(500, 50));
        Left_Panel.this.add(dimdes1);
        JLabel dimdes2 = new JLabel("Liczba generacji");
        dimdes2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        dimdes2.setPreferredSize(new Dimension(500, 50));
        Left_Panel.this.add(dimdes2);
        Path path = new Path();
        TextField_Lgen lgen = new TextField_Lgen();
        Button_StartStop startStop = new Button_StartStop(2);
        this.add(dimdes1);
        this.add(path);
        this.add(dimdes2);
        this.add(lgen);
        this.add(startStop);

    }
}
