import sun.applet.Main;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Rabbit extends JButton{
    static int rabbitnumber=0;

    static int id = 1;
    private int energy = 5;
    private int age = 1;
    private int x;
    private int y;
    private int img_x;
    private int img_y;
    private int name =id;
    private boolean select= false;

    public Rabbit() {

        String text = this.toString();
        Timer timer = new Timer();

        img_x = (int) (Math.random()*500);
        img_y = (int) (Math.random()*800);

        this.x = (int) (Math.random()*8);
        this.y = (int) (Math.random()*8);

        while (RabbitField.matrix[x][y] != 0) {
            this.x = (int) (Math.random()*8);
            this.y = (int) (Math.random()*8);
        }
        RabbitField.matrix[x][y] = name;
        img_x = x*100;
        img_y = y*100;



        this.setIcon(new  ImageIcon("rabbit.png"));
        this.setBounds(img_x,img_y,100,100);
        this.setVisible(true);
        this.setLayout(null);
        rabbitnumber++;


        TimerTask task = new TimerTask() {

            public void run() {

                img_x= RabbitField.actualx;
                img_y= RabbitField.actualy;
                RabbitField.actualpos[0] = RabbitField.actualx;
                RabbitField.actualpos[1] = RabbitField.actualy;
                move_one();


            }
        };

        timer.scheduleAtFixedRate(task, 10, 10);






        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {
                move_one();
                select=true;


                id++;
            }
        });

        this.addMouseListener(new MouseAdapter() {
            public void mouseEntered (MouseEvent e) {
                RabbitField.info= text;


                id++;
            }
        });










    }





    public void move_one() {
        if (select && RabbitField.actualx>0) {
            //img_x+=100;
            this.setBounds(img_x,img_y,100,100);
            RabbitField.matrix[x + 1][y] = name;
            RabbitField.matrix[x][y] = 0;


            //select=false;
        }
    }





    public int getImg_x() {
        return img_x;
    }

    public void setImg_x(int img_x) {
        this.img_x = img_x;
    }

    public int getImg_y() {
        return img_y;
    }

    public void setImg_y(int img_y) {
        this.img_y = img_y;
    }


    @Override
    public String toString() {
        return " Nyúl : " +
                " Energia: "+ energy +
                " Kor: " + age;
    }
}
