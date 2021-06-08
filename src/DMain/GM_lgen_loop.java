package DMain;

import GUI.RP_2D_wireworld_animation;
import GUI.Second_Window;
import InPut.Read_From_File;
import InPut.Save_To_File;
import InPut.World;
import PGame.Game;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class GM_lgen_loop {
    World world = new World();



    public GM_lgen_loop(int lgen, File apath,JFrame frame) throws FileNotFoundException {

        Read_From_File f = new Read_From_File();
        f.read_from_file(apath);
        RP_2D_wireworld_animation pright02 = new RP_2D_wireworld_animation(world,lgen-1);
        pright02.setVisible(true);
        JScrollPane scroller = new JScrollPane(pright02);
        scroller.setPreferredSize(new Dimension(720,720));
        frame.add(scroller);
        frame.pack();

    }


}
