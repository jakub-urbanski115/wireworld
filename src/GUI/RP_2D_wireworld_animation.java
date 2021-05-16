package GUI;

import InPut.World;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RP_2D_wireworld_animation extends JPanel  {

    private int rows = 10;
    private  int columns = 10;
    private final int cell_WIDTH =10;
    private final int cell_HEIGHT =10;
    private final int rec_WIDTH = 10;
    private final int rec_HEIGHT = 10;
    int lgen = 0;
    int cgen = 0;
    int [][] wrld= new int[rows][columns];


    public RP_2D_wireworld_animation (){
        this.setPreferredSize(new Dimension(720,720));
        this.setBackground(Color.black);
    }
    public RP_2D_wireworld_animation(World world){
        rows = world.getYdim();
        columns = world.getXdim();
        wrld = world.copy_world();
        this.setPreferredSize(new Dimension(columns*cell_WIDTH,rows*cell_HEIGHT));
        repaint();
    }
    public void update(World world2){
        rows = world2.getYdim();
        columns = world2.getXdim();
        wrld = world2.copy_world();
        this.setPreferredSize(new Dimension(columns*cell_WIDTH,rows*cell_HEIGHT));
        repaint();
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
