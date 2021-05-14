package GUI;

import DMain.GM_lgen_loop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Third_Window extends JFrame {

    private static final Left_Panel003 pleft = new Left_Panel003();
    private static final RP_2D_wireworld_animation pright = new RP_2D_wireworld_animation();

    private int wrlddim001;
    private int wrldlgen001;
    private File apath;
    private boolean suc001 = false;
    private boolean suc002 = false;

    public Third_Window() {
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(pleft, BorderLayout.WEST);
        this.add(pright, BorderLayout.EAST);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
    private void set_buttons3() {

        ActionListener buttonListener03 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w3) {
                Object o = w3.getSource();
                if (o == pleft.startStop) {
                    String text = pleft.lgen.getText();
                    if (text != null) {

                        try {
                            Integer.parseInt(text);
                            suc001 = true;
                        } catch (NumberFormatException nfe) {
                            pleft.startStop.setText("Wpisz lgen i WYSTARTUJ");
                            suc001 = false;
                        }
                        if (suc001) {
                            wrldlgen001 = Integer.parseInt(text);
                        }
                    }
                    if (!suc002) {
                        pleft.startStop.setText("najpierw PATH");
                    } else {
                        if (suc001) {
                            new GM_lgen_loop(wrldlgen001, apath);
                            pleft.startStop.setText("Inprogress");
                        }
                    }
                } else if (o == pleft.path) {
                    JFileChooser chooser = new JFileChooser();
                    int decision = chooser.showOpenDialog(null);
                    if (decision == JFileChooser.APPROVE_OPTION) {
                        apath = chooser.getSelectedFile();
                        suc002 = true;
                    }
                }
            }
        };
        pleft.startStop.addActionListener(buttonListener03);
        pleft.path.addActionListener(buttonListener03);
    }
}
