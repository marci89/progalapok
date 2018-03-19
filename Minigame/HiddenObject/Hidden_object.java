import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.*;
import javax.imageio.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Hidden_object extends  JFrame  {
    int number =0;


    public Hidden_object() {
        JFrame frame = new JFrame("game");

        try {
            frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("room.jpg")))));

        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new FlowLayout());
        frame.setResizable(false);

        frame.setSize(1300, 720);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setVisible(true);

        Music sound = new Music("01.wav");



        Obj_img a = new Obj_img(200,200,200,200,"gomb.png");
        frame.add(a);
        Obj_img b = new Obj_img(400,200,200,200,"gomb.png");
        frame.add(b);
        Obj_img c = new Obj_img(600,200,200,200,"gomb.png");
        frame.add(c);
        Obj_img d = new Obj_img(800,200,200,200,"gomb.png");
        frame.add(d);






        //JLabel label1 = new JLabel(new ImageIcon("gomb.png"));
        //label1.setBounds(200, 200, 200, 200);
        //frame.add(label1);

        JButton button1 = new JButton();
        button1.setBounds(800, 200, 150, 30);


        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
           button1.setText("sikerült" + number);
           number++;
                sound.music();
                if (Obj_img.piece==0)
                    a.setVisible(true);
            }
        });




        button1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button1.setText("sikerült" + number);
                number++;


            }
        });






        frame.add(button1);





        }



}
