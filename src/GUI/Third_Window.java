package GUI;

import DMain.GM_lgen_loop;
import InPut.Read_From_File;
import InPut.Save_To_File;
import InPut.World;
import PGame.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


public class Third_Window  {

    private static final Left_Panel003 pleft = new Left_Panel003();
    private RP_2D_wireworld_animation pright = new RP_2D_wireworld_animation();

    private int wrldlgen001;
    private File apath;
    private boolean suc001 = false;
    private boolean suc002 = false;

    World world = new World();
    Game game = new Game();


    JFrame frame003 = new JFrame();

    public Third_Window() {
        frame003.setLayout(new BorderLayout());
        frame003.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame003.add(pright,BorderLayout.EAST);
        frame003.add(pleft, BorderLayout.WEST);

        setbuttonsListener03();

        frame003.pack();
        frame003.setResizable(false);
        frame003.setVisible(true);
    }
    private void setbuttonsListener03() {

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
                            pleft.startStop.setText("Inprogress");
                            pright.setVisible(false);
                            try {
                                new GM_lgen_loop(wrldlgen001, apath, frame003);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            /*Read_From_File f = new Read_From_File();
                            try {
                                f.read_from_file(apath);
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            RP_2D_wireworld_animation pright02 = new RP_2D_wireworld_animation(world);
                            frame003.add(pright02);
                            pright02.setVisible(true);

                            for(int i = 0 ; i<wrldlgen001;i++){
                                game.world_loop(world);
                                pright02.update(world);

                                //timer.schedule(refresh(pright02),0,500);

                            }

                            Save_To_File save = new Save_To_File();

                            try {
                                save.save_to_file(wrldlgen001);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }


*/

                            pleft.startStop.setText("Done");
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
