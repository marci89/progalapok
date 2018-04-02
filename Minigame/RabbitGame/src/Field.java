import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Field extends JButton {

    private int row;
    private int col;
    private boolean infovisible = false;
    private ImageIcon field_img = new ImageIcon("images/field.png");

    public Field(int row, int col,int [][] matrix, Rabbit [] rabbitArray, Rabbit [] selected) {
        Timer timer = new Timer();

        this.row = row;
        this.col = col;

        this.setIcon(field_img);
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

                RabbitField.info.setText("<html>Mező:<br/>Potenciális célpont<br/> vagy itt</html>");
            }
        });


        this.addMouseListener(new MouseAdapter() {
            public void mouseExited (MouseEvent e) {
                RabbitField.info.setText("");

            }
        });

        TimerTask task = new TimerTask() {

            public void run() {

                if (matrix[row][col]==0) {
                    setVisible(true);
                }
                else setVisible(false);

            }
        };

        timer.scheduleAtFixedRate(task, 10, 10);
    }
}
