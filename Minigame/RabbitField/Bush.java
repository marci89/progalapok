import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Bush extends JButton{

    private int img_x;
    private int img_y;

    public Bush() {
        Timer timer = new Timer();

        int x = (int) (Math.random()*8);
        int y = (int) (Math.random()*8);

        while (RabbitField.matrix[x][y] != 0) {
            x = (int) (Math.random()*8);
            y = (int) (Math.random()*8);
        }
        RabbitField.matrix[x][y] = 9;
        img_x = x*100;
        img_y = y*100;
        this.setIcon(new  ImageIcon("brush.png"));
        //this.setLayout(null);
        this.setBounds(img_x,img_y,100,100);
        this.setVisible(true);
        this.setLayout(null);





        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {
                RabbitField.actualx = img_x;
                RabbitField.actualy = img_y;



            }
        });


        TimerTask task = new TimerTask() {

            public void run() {

                if (RabbitField.actualpos[0] == img_x && RabbitField.actualpos[1] == img_y) {
                    setVisible(false);
                }
                else setVisible(true);

            }
        };

        timer.scheduleAtFixedRate(task, 10, 10);



    }
}
