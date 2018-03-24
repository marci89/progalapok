import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class RabbitField extends JFrame {

    static int[][] matrix = new int[8][8];
    static int [] actualpos = new int[2];
    static int actualx = 0;
    static int actualy = 0;
    static String info ="fffffffff";
    int counter = 0;
    int tableline =0;

    public RabbitField() {

        Timer timer = new Timer();

        JFrame frame = new JFrame();

        JLabel infolabel = new JLabel("szia");
        infolabel.setText(info);
        infolabel.setBounds(800, 0, 300, 100);
        infolabel.setVisible(true);
        infolabel.setForeground(Color.yellow);
        frame.add(infolabel);

        JPanel panel = new JPanel();
        panel.setBounds(800,0,200,200);
        panel.setVisible(true);
        panel.setBackground(Color.BLACK);
        frame.add(panel);


        JLabel label = new JLabel("szia");
        label.setText("hahdhefvef");
        label.setBounds(850, 0, 100, 100);
        label.setVisible(true);
        frame.add(label);
        int x = 0;
        int y = 0;



        for (int i = 0; i < 20; i++) {

            frame.add(new Rabbit());
        }
/*

*/







        int number = 0;
        for (int i = 0; i < 20; i++) {
            frame.add(new Bush());
        }

        for (int i = 0; i < 20; i++) {
            frame.add(new Grass());

        }







        for (int i = 0; i<RabbitField.matrix.length; i++) {
            for (int j = 0; j<RabbitField.matrix[i].length; j++) {
                if (RabbitField.matrix[i][j]==0) {
                    //frame.add(new Field(i,j));


                }
            }
        }



        for (int i = 0; i <= 8; i++) {
            frame.add(new Field(x,y));

            x+=100;

            if (i==8 && tableline<7) {
                i=0;
                y+=100;
                x=0;

                tableline++;
            }
        }






        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setSize(1000, 850);
        frame.setLayout(null);
        frame.setVisible(true);


        TimerTask task = new TimerTask() {

            public void run() {

                label.setText("arayos" + actualx + " " + actualy);
                infolabel.setText(info);
                //actualx=-10;
                //actualy=-10;
                counter++;


            }
        };

        timer.scheduleAtFixedRate(task, 10, 10);






    }
}


