package GUI;

import InPut.Save_To_File;
import InPut.World;
import PGame.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RP_2D_wireworld_animation extends JPanel  {

    private int rows = 1;
    private  int columns = 1;
    private final int cell_WIDTH =11;
    private final int cell_HEIGHT =11;
    private final int rec_WIDTH = 10;
    private final int rec_HEIGHT = 10;
    int [][] wrld= new int[rows][columns];
    int interval = 100;
    World world ;


    public RP_2D_wireworld_animation(){
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(720,720));
    }

    public RP_2D_wireworld_animation(World wrld0,int lgen){
        world = wrld0;
        Game game = new Game();
        rows = world.getXdim();
        columns = world.getYdim();
        this.setPreferredSize(new Dimension(rows*cell_HEIGHT, columns*cell_WIDTH));
        new Timer(interval, new ActionListener() {
            int currentFrame = 0;
            public void actionPerformed(ActionEvent e) {
                game.world_loop(world,interval);
                repaint();
                if (currentFrame != lgen)
                    currentFrame++;
                else {
                    Save_To_File save = new Save_To_File();

                    try {
                        save.save_to_file(lgen);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                    ((Timer) e.getSource()).stop();
                }
            }
        }).start();
    }

    public void paint (Graphics g){
        super.paint(g);
        if(world !=null) {
            wrld = world.copy_world();
        }
        Graphics2D g2D = (Graphics2D)g;

        for(int i = 0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                if(wrld[i][j]==0){
                    g2D.setPaint(Color.black);
                }else if (wrld[i][j]==1){
                    g2D.setPaint(Color.blue);
                }else if(wrld[i][j]==2){
                    g2D.setPaint(Color.red);
                }else g2D.setPaint(Color.yellow);

                g2D.fillRect(i*cell_HEIGHT,j*cell_WIDTH,rec_WIDTH,rec_HEIGHT);
            }
        }
    }
}
