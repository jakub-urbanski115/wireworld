package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RP_2D_wireworld_animation extends JPanel implements ActionListener {


    private final int rows = 100;
    private final int columns = 100;
    private final int cell_WIDTH =10;
    private final int cell_HEIGHT =10;
    private final int rec_WIDTH = 10;
    private final int rec_HEIGHT = 10;
    int lgen = 0;
    int cgen = 0;
    int [][] wrld= new int[rows][columns];

    Timer timer;

    public RP_2D_wireworld_animation (){
        this.setPreferredSize(new Dimension(720,720));
        this.setBackground(Color.black);
    }
    public RP_2D_wireworld_animation(int lgen){
        this.setPreferredSize(new Dimension(columns*cell_WIDTH,rows*cell_HEIGHT));
        timer = new Timer(1000,this);
        timer.start();
    }

    private void stop(){
        timer.stop();
    }
    public void paint (Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D)g;

        for(int i = 0; i<rows;i++){
            for(int j = 0; j<columns;j++){
                wrld[i][j]= (int) (Math.random() * ((4) + 1));
                if(wrld[i][j]==0){
                    g2D.setPaint(Color.black);
                }else if (wrld[i][j]==1){
                    g2D.setPaint(Color.white);
                }else if(wrld[i][j]==2){
                    g2D.setPaint(Color.yellow);
                }else g2D.setPaint(Color.blue);




                g2D.fillRect(i*cell_HEIGHT,j*cell_WIDTH,rec_WIDTH,rec_HEIGHT);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(lgen!= 0) {
            if (cgen == lgen) {
                stop();
            }
            cgen++;
        }
        repaint();
    }
}
