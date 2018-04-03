import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

public class RabbitField extends JFrame {

    private int matrix [][] = new int [8][8];
    private Rabbit [] rabbitArray = new Rabbit [24];
    private Eagle [] eagleArray = new Eagle [24];
    private Rabbit selectedAnimal [] = new Rabbit [1];
    private boolean youngRabbit= true;
    static JLabel info = new JLabel();
    static boolean round = false;
    private boolean race;
    //private int number = 0;
    private int year;




    public RabbitField() {
        Timer timer = new Timer();
        JFrame frame = new JFrame();


        EagleAnimation eaglemover = new EagleAnimation();
        frame.add(eaglemover);


        info.setFont(new Font("Serif",Font.PLAIN, 15));

        JButton button1 = new JButton();
        button1.setBounds(800,200,200,50);
        button1.setText("info");
        button1.setVisible(true);
        frame.add(button1);

        info.setBounds(800,0,200,100);
        info.setFont(new Font("Serif",Font.PLAIN, 15));
        info.setVisible(true);
        info.setForeground(Color.yellow);
        frame.add(info);

        JLabel info2 = new JLabel();
        info2.setBounds(800,110,200,100);
        info2.setFont(new Font("Serif",Font.PLAIN, 20));
        info2.setVisible(true);
        info2.setForeground(Color.yellow);
        info2.setText("<html>" + year + ". év <br/>nyulak száma: " + Rabbit.rabbitNumber + "<br/>sasok száma: " + Eagle.eagleNumber + "</html>");
        frame.add(info2);

        JPanel panel = new JPanel();
        panel.setBounds(800,0,200,100);
        panel.setBackground(Color.BLACK);
        panel.setBorder(new LineBorder(Color.WHITE));
        panel.setVisible(true);
        frame.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(800,100,200,100);
        panel2.setBackground(Color.BLACK);
        panel2.setBorder(new LineBorder(Color.WHITE));
        panel2.setVisible(true);
        frame.add(panel2);




        for (int i = 0; i < 8; i++) {
            new Eagle(eagleArray,frame);
        }


        for (int i = 0; i < 5; i++) {
            frame.add(new Rabbit(matrix,rabbitArray,selectedAnimal));
        }

        for (int i = 0; i < 5; i++) {
            frame.add(new SuperRabbit(matrix,rabbitArray,selectedAnimal));
        }

        for (int i = 0; i < 20; i++) {
            frame.add(new Bush(matrix,selectedAnimal));
        }

        for (int i = 0; i < 20; i++) {
            frame.add(new Food(matrix,selectedAnimal,frame));
        }



        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
                frame.add(new Field(i,j,matrix,rabbitArray,selectedAnimal));
            }
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1000, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);


        button1.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {
            inforeader();

            }
        });


        TimerTask task = new TimerTask() {

            public void run() {
                if (round) {
                    round=false;
                    nextRound(frame, eaglemover,info2);
                }
            }
        };
        timer.scheduleAtFixedRate(task, 10, 10);
    }

    public void nextRound(JFrame frame, EagleAnimation eaglemover, JLabel info2) {
        year++;
        int random = (int) (Math.random()*20);

        for (int i = 0; i<rabbitArray.length;i++) {
            if (rabbitArray[i] != null) {
                if (rabbitArray[i].getAge() < 4) {
                    youngRabbit = true;
                }
            }
        }


        if (Eagle.eagleNumber>0 && youngRabbit==true) {
            while (eagleArray[random] == null) {
                random = (int) (Math.random() * 20);
            }

            eagleArray[random].attack(rabbitArray, matrix, frame, eaglemover);
            selectedAnimal[0] = null;
        }

        youngRabbit=false;

        // nyul
        for (int i = 0; i<rabbitArray.length;i++) {
            if (rabbitArray[i] != null) {
                rabbitArray[i].setAge(rabbitArray[i].getAge() + 1);
                if (rabbitArray[i].getAge() < 4) {
                    youngRabbit = true;
                }

                if (rabbitArray[i].getAge() > 10 || rabbitArray[i].getEnergy() < 1) {
                    rabbitArray[i].death(matrix);
                    selectedAnimal[0] = null;
                    rabbitArray[i] = null;
                }
                else if (rabbitArray[i].getAge() >=4 && rabbitArray[i].getEnergy() >= 4 && Rabbit.rabbitNumber <= 23) {
                        race = rabbitArray[i] instanceof SuperRabbit;
                        rabbitArray[i].energy-=2;
                    if (!race) frame.add(new Rabbit(matrix, rabbitArray, selectedAnimal));

                    else  frame.add(new SuperRabbit(matrix, rabbitArray, selectedAnimal));
                }

frame.repaint();
            }
            }

        // sas
        for (int i = 0; i<eagleArray.length;i++) {
            if (eagleArray[i] != null) {
                eagleArray[i].setAge(eagleArray[i].getAge() + 1);
                if (eagleArray[i].getAge()>10) {
                    eagleArray[i].death();

                    selectedAnimal[0] = null;
                    eagleArray[i]=null;
                }
                else if (eagleArray[i].getAge()>=4 && eagleArray[i].getEnergy()>=4 && Eagle.eagleNumber<=23) {
                    new Eagle(eagleArray,frame);
                    eagleArray[i].energy-=2;
                }
            }
        }
        frame.repaint();

        frame.repaint();
        info2.setText("<html>" + year + ". év <br/>nyulak száma: " + Rabbit.rabbitNumber + "<br/>sasok száma: " + Eagle.eagleNumber + "</html>");

        if (Eagle.eagleNumber==0) {
            JOptionPane.showMessageDialog(null, "A nyúl faj nyert! Gratulálok","Győzelem!",JOptionPane.PLAIN_MESSAGE);
        }

        if (Rabbit.rabbitNumber==0) {
            JOptionPane.showMessageDialog(null, "A sas faj nyert! Sajnos veszítettél", "Vereség", JOptionPane.PLAIN_MESSAGE);
        }
    }


    public void inforeader () {
        String text = "";
        try {
            File fileDir = new File("info.txt");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileDir), "UTF8"));

            String str;

            while ((str = in.readLine()) != null) {
                text+=str.toString();
            }

            in.close();
        }
        catch (UnsupportedEncodingException e)
        {
        }
        catch (IOException e)
        {
        }
        catch (Exception e)
        {
        }


    JFrame infoframe = new JFrame();

        JLabel gameinfo = new JLabel();
        gameinfo.setBounds(0,0,700,700);
        gameinfo.setFont(new Font("Serif",Font.PLAIN, 20));
        gameinfo.setVisible(true);
        gameinfo.setForeground(Color.yellow);
        gameinfo.setText("");
        infoframe.add(gameinfo);

        gameinfo.setText(text);

        infoframe.setResizable(false);
        infoframe.setSize(700, 700);
        infoframe.setLayout(null);
        infoframe.setVisible(true);
        infoframe.getContentPane().setBackground(Color.black);
    }
}
