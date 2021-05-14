package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Second_Window extends JFrame {
    public static Left_Panel002 pleft = new Left_Panel002();
    public static RP_2D_wireworld_animation pright = new RP_2D_wireworld_animation();

    private int wrlddim001;
    private int wrldlgen001;
    private File apath;
    private boolean suc001 = false;



    public Second_Window(){
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.add(pleft,BorderLayout.WEST);

        this.add(pright,BorderLayout.EAST);

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
    private void setUpButtonListener02() {
        ActionListener buttonListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent w2) {
                Object o = w2.getSource();
                if (o == pleft.startStop) {
                    if (pleft.startStop.getText().equals("START")) {
                        if(suc001){
                            //infloopstart
                            pleft.startStop.setText("STOP");
                        }
                    } else {
                        pleft.startStop.setText("START");
                        //infloopstop
                    }

                } else if (o == pleft.bconfirm) {
                    String text = pleft.tfDim.getText();
                    if (text != null) {
                        try {
                            Integer.parseInt(text);
                            suc001 = true;
                        } catch (NumberFormatException nfe) {
                            pleft.bconfirm.setText("Wpisz int i zatwierdz");
                            suc001 = false;
                        }
                        if (suc001) {
                            wrlddim001 = Integer.parseInt(text);
                            pleft.bconfirm.setText("ZATWIERDZONO");
                        }
                    }
                }
            }

        };
        pleft.startStop.addActionListener(buttonListener2);
        pleft.bconfirm.addActionListener(buttonListener2);
    }

}
