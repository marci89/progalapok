import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Bush extends JButton{

    private int row;
    private int col;
    private ImageIcon img = new ImageIcon("images/bush.jpg");

    public Bush ( int [][] matrix, Rabbit [] selected) {
        Timer timer = new Timer();

        while (matrix[row][col] != 0) {
            row = (int) (Math.random()*8);
            col = (int) (Math.random()*8);
        }

        matrix[row][col] = 3;
        this.setIcon(img);
        this.setBounds(col*100,row*100,100,100);
        this.setVisible(true);

        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {
                if (selected[0] != null) {
                    selected[0].move(row, col, matrix);
                }
            }
        });

        this.addMouseListener(new MouseAdapter() {
            public void mouseEntered (MouseEvent e) {

                RabbitField.info.setText("<html>Bokor: <br/>eltudsz itt bújni<br/> a sasok elől.</html> ");
            }
        });

        this.addMouseListener(new MouseAdapter() {
            public void mouseExited (MouseEvent e) {
                RabbitField.info.setText("");
            }
        });


        TimerTask task = new TimerTask() {

            public void run() {

                if (matrix[row][col]==3) {
                    setVisible(true);
                }
                else setVisible(false);

            }
        };
        timer.scheduleAtFixedRate(task, 10, 10);

    }



}
