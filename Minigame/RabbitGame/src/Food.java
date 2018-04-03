
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Food extends JButton{

        private int row;
        private int col;
        private int counter;
        private ImageIcon img = new ImageIcon("images/carrot.jpg");
        private Food foodObj;

        public Food ( int [][] matrix, Rabbit [] selected, JFrame frame) {

            Timer timer = new Timer();

            while (matrix[row][col] != 0) {
                row = (int) (Math.random()*8);
                col = (int) (Math.random()*8);
            }

            matrix[row][col] = 4;
            this.setIcon(img);
            this.setBounds(col*100,row*100,100,100);
            this.setVisible(true);
            foodObj = this;

            this.addMouseListener(new MouseAdapter() {
                public void mouseClicked (MouseEvent e) {
                    if (selected[0] != null) {
                    selected[0].move(row, col, matrix);
                }
                }
            });

            this.addMouseListener(new MouseAdapter() {
                public void mouseEntered (MouseEvent e) {
                    RabbitField.info.setText("<html>Répa: <br/> Nyulaid táplálék forrása</html> ");
                }
            });

            this.addMouseListener(new MouseAdapter() {
                public void mouseExited (MouseEvent e) {
                    RabbitField.info.setText("");
                }
            });


            TimerTask task = new TimerTask() {

                public void run() {

                    if (matrix[row][col]==4) {
                        setVisible(true);
                    }
                    else if (counter==0) {
                        setVisible(false);
                        frame.add(new Food(matrix,selected,frame));
                        counter++;
                    }
                    else setVisible(false);

                }
            };
            timer.scheduleAtFixedRate(task, 10, 10);
        }

    }



