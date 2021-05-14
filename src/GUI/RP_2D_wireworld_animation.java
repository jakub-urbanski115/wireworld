package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RP_2D_wireworld_animation extends JPanel implements ActionListener {


    int rows = 100;
    int columns = 100;
    int rec_WIDTH = 10;
    int rec_HEIGHT = 10;
    int x = 1;
    int y = 1;

    Timer timer;

    public RP_2D_wireworld_animation (int f){
        this.setPreferredSize(new Dimension(columns*rec_WIDTH,rows*rec_HEIGHT));
        this.setBackground(Color.black);
        timer = new Timer(10,this);
        timer.start();

    }
    public void paint (Graphics g){
        super.paint(g);

        Graphics2D g2D = (Graphics2D)g;

        for(int i = 0; i<rows;i++){
            for(int j = 0; j<rows;j++){
                g2D.setPaint(Color.white);
                g2D.fillRect(i*rec_HEIGHT,j*rec_WIDTH,8,8);
            }
        }

        g2D.setPaint(Color.blue);
        g2D.drawRect(x,y,100,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x=x+1;
        y=y+1;


        repaint();
    }
}
