package GUI;

import DMain.GM_lgen_loop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
/*
opcjonalna czesc nie udalo sie zrealizowac
 */

public class Left_Panel002 extends JPanel {

    private static Dimension dim2 = new Dimension(560, 720);

    public Button_Confirm bconfirm = new Button_Confirm();
    public TextField_Dim tfDim = new TextField_Dim();
    public Button_StartStop startStop = new Button_StartStop(1);

    public Left_Panel002() {
        this.setPreferredSize(dim2);
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(0x22223D));
        this.setVisible(true);

        Panel_add padd = new Panel_add();
        JLabel dimdes = new JLabel("Podaj rozmiar mapy");
        dimdes.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        dimdes.setPreferredSize(new Dimension(500, 50));
        Left_Panel002.this.add(dimdes);
        this.add(tfDim);
        this.add(bconfirm);
        this.add(padd);
        this.add(startStop);

    }


}
