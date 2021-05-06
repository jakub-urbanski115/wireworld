package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class First_Window extends JFrame{

    private final JLabel label001 = new JLabel("Choose your rabbit hole");

    private final Button_Read_from_File butr =  new Button_Read_from_File();
    private final Button_Draw butf= new Button_Draw();
    public static final Dimension dim = new Dimension(1280,720);


    public First_Window(){
        this.setPreferredSize(dim);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        makeachoice();
        setUpButtonListener01();
        this.add(label001,BorderLayout.NORTH);
        this.add(butr,BorderLayout.WEST);
        this.add(butf,BorderLayout.EAST);


        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
    private void makeachoice(){
        label001.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        label001.setHorizontalAlignment(SwingConstants.CENTER);

    }
    public void setUpButtonListener01(){
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goner();
                Object o = e.getSource();
                if(o == butf){
                    butf.second_window();
                }else if (o == butr){
                    butr.third_window();
                }
            }
        };
        butf.addActionListener(buttonListener);
        butr.addActionListener(buttonListener);
    }
    public void goner(){
        this.setVisible(false);
    }
}
