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
    Game game = new Game();
    java.util.Timer timer = new Timer();

    public GM_lgen_loop(int lgen, File apath,JFrame frame) throws FileNotFoundException {

        Read_From_File f = new Read_From_File();
        try {
            f.read_from_file(apath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        RP_2D_wireworld_animation pright02 = new RP_2D_wireworld_animation(world);
        frame.add(pright02);
        pright02.setVisible(true);

        for(int i = 0 ; i<lgen;i++){
            game.world_loop(world);
            pright02.update(world);

            //timer.schedule(refresh(pright02),0,500);

        }

        Save_To_File save = new Save_To_File();

        try {
            save.save_to_file(lgen);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private TimerTask refresh( RP_2D_wireworld_animation pright02 ){

        int [][] copiedworld;
        copiedworld = world.copy_world();
        int x = world.getXdim();
        int y = world.getYdim();
        for(int k = 0; k < y; k++) {
            for (int j = 0; j < x; j++) {
                System.out.print(copiedworld[j][k] + " ");
            }
            System.out.print("\n");
        }

        return null;
    }
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

}
