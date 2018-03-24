import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.Timer;


public class Field extends JButton{

private int image_x;
private int image_y;

    public Field(int image_x, int image_y) {
        Timer timer = new Timer();
        this.image_x = image_x;
        this.image_y=image_y;




        this.setIcon(new  ImageIcon("field.png"));
        this.setBounds(image_x,image_y,100,100);
        //this.setVisible(true);
        this.setLayout(null);
        if (this.image_x>700) {
            setVisible(false);
        }






        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {

                RabbitField.actualx = image_x;
                RabbitField.actualy = image_y;

            }
        });



        TimerTask task = new TimerTask() {

            public void run() {


                if (RabbitField.actualpos[0] == image_x && RabbitField.actualpos[1] == image_y) {
                    setVisible(false);
                }
                else setVisible(true);

            }
        };

        timer.scheduleAtFixedRate(task, 10, 10);


    }




}
