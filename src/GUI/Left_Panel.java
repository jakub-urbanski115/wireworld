package GUI;

import DMain.GM_lgen_loop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Left_Panel extends JPanel {

    private static Dimension dim2 = new Dimension(560, 720);
    private int wrlddim001;
    private int wrldlgen001;
    private File apath;
    private boolean suc001 = false;
    private boolean suc002 = false;

    public Left_Panel(int f) {
        if (f == 2) {
            set_buttons2();
        } else set_buttons3();
        this.setPreferredSize(dim2);
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(0x22223D));
        this.setVisible(true);


    }


    private void set_buttons2() {

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
        ActionListener buttonListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w2) {
                Object o = w2.getSource();
                if (o == startStop) {
                    if (startStop.getText().equals("START")) {
                        startStop.setText("STOP");
                    } else {
                        startStop.setText("START");
                    }

                } else if (o == bconfirm) {
                    String text = tfDim.getText();
                    if (text != null) {
                        try {
                            Integer.parseInt(text);
                            suc001 = true;
                        } catch (NumberFormatException nfe) {
                            bconfirm.setText("Wpisz int i zatwierdz");
                            suc001 = false;
                        }
                        if (suc001) {
                            wrlddim001 = Integer.parseInt(text);
                            bconfirm.setText("ZATWIERDZONO");
                        }
                    }
                }
            }

        };
        startStop.addActionListener(buttonListener2);
        bconfirm.addActionListener(buttonListener2);
    }


    private void set_buttons3() {
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
        ActionListener buttonListener03 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w3) {
                Object o = w3.getSource();
                if (o == startStop) {
                    String text = lgen.getText();
                    if (text != null) {

                        try {
                            Integer.parseInt(text);
                            suc001 = true;
                        } catch (NumberFormatException nfe) {
                            startStop.setText("Wpisz lgen i WYSTARTUJ");
                            suc001 = false;
                        }
                        if (suc001) {
                            wrldlgen001 = Integer.parseInt(text);
                        }
                    }
                    if (!suc002) {
                        startStop.setText("najpierw PATH");
                    } else {
                        if (suc001) {
                            new GM_lgen_loop(wrldlgen001, apath);
                        }
                    }
                } else if (o == path) {
                    JFileChooser chooser = new JFileChooser();
                    int decision = chooser.showOpenDialog(null);
                    if (decision == JFileChooser.APPROVE_OPTION) {
                        apath = chooser.getSelectedFile();
                        suc002 = true;
                    }
                }
            }
        };
        startStop.addActionListener(buttonListener03);
        path.addActionListener(buttonListener03);
    }

}
