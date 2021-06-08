package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
/*
opcjonalna czesc nie udalo sie zrealizowac
 */

public class Second_Window  {
    private static Left_Panel002 pleft = new Left_Panel002();
    private RP_2D_wireworld_animation pright = new RP_2D_wireworld_animation();


    private int wrlddim001;
    private int wrldlgen001;
    private File apath;
    private boolean suc001 = false;
    JFrame frame002 = new JFrame();


    public Second_Window(){
        init_Second_Window();
    }

    private void init_Second_Window(){

        frame002.setLayout(new BorderLayout());
        frame002.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame002.add(pright,BorderLayout.EAST);
        frame002.add(pleft,BorderLayout.WEST);

        setUpButtonListener02();

        frame002.pack();
        frame002.setResizable(false);
        frame002.setVisible(true);
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
