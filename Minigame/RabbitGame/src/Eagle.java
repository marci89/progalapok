import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Eagle {
    private int age =0;
    protected int energy =3;
    private Eagle eagleObj;
    private JButton picture = new JButton();
    static boolean animation=true;
    static int eagleNumber = 0;
    private int number = 0;

    public Eagle(Eagle [] eagleArray, JFrame frame) {

        int counter =0;
        int picturePos =0;
        for (int i = 0; i < eagleArray.length;i++) {
            if (eagleArray[i] == null && counter==0) {
                eagleArray[i] =this;
                picturePos = i;
                counter++;
            }
        }

        eagleObj = this;
        eagleNumber++;

        if (picturePos<20) {
            picture.setBounds(0 + picturePos*50, 800, 50, 50);
        }
        else {
            picture.setBounds(0 + picturePos*50-200, 750, 50, 50);
        }

        picture.setVisible(true);
        picture.setIcon(new ImageIcon("images/eaglepic.jpg"));
        frame.add(picture);

        picture.addMouseListener(new MouseAdapter() {
            public void mouseEntered (MouseEvent e) {

                RabbitField.info.setText(eagleObj.toString());
            }
        });

        picture.addMouseListener(new MouseAdapter() {
            public void mouseExited (MouseEvent e) {
                RabbitField.info.setText("");
            }
        });


    }


    public void attack(Rabbit [] rabbitArray, int [] [] matrix, JFrame frame, EagleAnimation eaglemover) {
        int counter =0;
        for (int i = 0; i < rabbitArray.length;i++) {
            if (rabbitArray[i] != null && counter == 0) {
                if (matrix[rabbitArray[i].getRow()][rabbitArray[i].getCol()] == 1) {
                    if (rabbitArray[i].getAge() < 3) {
                        eaglemover.setY(rabbitArray[i].row*100-90);
                        eaglemover.setX(rabbitArray[i].col*100-90);
                        eaglemover.goAway();


                        counter++;
                        energy += 2;
                        rabbitArray[i].death(matrix);
                        rabbitArray[i] = null;
                    }
                }
            }
        }


    }


    public void death() {
        picture.setVisible(false);
        eagleNumber--;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isAnimation() {
        return animation;
    }

    public void setAnimation(boolean animation) {
        this.animation = animation;
    }

    @Override
    public String toString() {

        return "<html>Sas<br/>kor: " + age + "<br/>energy: " + energy + "</html>";
    }

}
