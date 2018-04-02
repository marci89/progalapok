import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;

public class EagleAnimation  extends JLabel{
    private int x;
    private int y;
    private EagleAnimation moverobj;


    public EagleAnimation() {


        Timer timer = new Timer();


        this.setBounds(2000,2000,300,300);
        this.setVisible(true);
        this.setIcon(new ImageIcon("images/eagleanim.gif"));

        moverobj =this;
        TimerTask task = new TimerTask() {

            public void run() {

                    moverobj.setBounds(x, y, 300, 300);
                    y-=2;
            }

        };
        timer.scheduleAtFixedRate(task, 10, 10);
    }

    public void goAway () {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
