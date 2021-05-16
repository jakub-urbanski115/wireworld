package GUI;

import InPut.World;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RP_2D_wireworld_animation extends JPanel  {

    private int rows = 1;
    private  int columns = 1;
    private final int cell_WIDTH =11;
    private final int cell_HEIGHT =11;
    private final int rec_WIDTH = 10;
    private final int rec_HEIGHT = 10;
    int [][] wrld= new int[rows][columns];
    public RP_2D_wireworld_animation(){
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(720,720));
    }

    public RP_2D_wireworld_animation(World world){
        rows = world.getYdim();
        columns = world.getXdim();
        wrld = world.copy_world();
        this.setPreferredSize(new Dimension(columns*cell_WIDTH,rows*cell_HEIGHT));
    }
    public void update(World world2){
        wrld = world2.copy_world();
        repaint();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void paint (Graphics g){
        super.paint(g);

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
