import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Rabbit extends JButton {

    protected int row;
    protected int col;
    protected int age = 0;
    protected int energy = 5;
    protected Rabbit rabbitObj;
    protected int matrix_value = 0;
    static int rabbitNumber=0;

    public Rabbit(int [][] matrix,Rabbit [] rabbitArray, Rabbit [] selectedanimal) {

        row = (int) (Math.random()*8);
        col = (int) (Math.random()*8);

        while (matrix[row][col] != 0) {
            row = (int) (Math.random()*8);
            col = (int) (Math.random()*8);
        }

        matrix[row][col] = 1;
        this.setIcon(new ImageIcon("images/rabbit.png"));
        this.setBounds(col*100,row*100,100,100);
        this.setVisible(true);
        rabbitObj=this;

        int i = 0;
        while (rabbitArray[i] != null) {
            i = (int) (Math.random()*24);
        }
        rabbitArray[i] =rabbitObj;
        rabbitNumber++;

        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {
              selectedanimal[0] = rabbitObj;
            }
        });

        this.addMouseListener(new MouseAdapter() {
            public void mouseEntered (MouseEvent e) {
                RabbitField.info.setText(rabbitObj.toString());
            }
        });

        this.addMouseListener(new MouseAdapter() {
            public void mouseExited (MouseEvent e) {
                RabbitField.info.setText("");
            }
        });
    }

    public void move (int x, int y, int [][] matrix) {
       if (y == col+2 && x == row && matrix[x][y]!=1 && matrix[x][y]!=2) {

           setBounds(y * 100, x * 100, 100, 100);
           matrix[row][col] = matrix_value;
           matrix_value = matrix[row][col + 2];
           matrix[row][col + 2] = 1;
           col += 2;
           matrix[row][col] =1;
           check(matrix);
       }

        if (y == col+1 && x == row && matrix[x][y]!=1 && matrix[x][y]!=2) {

            setBounds(y * 100, x * 100, 100, 100);
            matrix[row][col] = matrix_value;
            matrix_value = matrix[row][col + 1];
            matrix[row][col + 1] = 1;
            col += 1;
            matrix[row][col] =1;
            check(matrix);
        }

        if (y == col-2 && x == row && matrix[x][y]!=1 && matrix[x][y]!=2) {

            setBounds(y * 100, x * 100, 100, 100);
            matrix[row][col] = matrix_value;
            matrix_value = matrix[row][col - 2];
            matrix[row][col - 2] = 1;
            col -= 2;
            matrix[row][col] =1;
            check(matrix);
        }

        if (y == col-1 && x == row && matrix[x][y]!=1 && matrix[x][y]!=2) {

            setBounds(y * 100, x * 100, 100, 100);
            matrix[row][col] = matrix_value;
            matrix_value = matrix[row][col - 1];
            matrix[row][col - 1] = 1;
            col -= 1;
            matrix[row][col] =1;
            check(matrix);
        }

        if (y == col && x == row+2 && matrix[x][y]!=1 && matrix[x][y]!=2) {

            setBounds(y * 100, x * 100, 100, 100);
            matrix[row][col] = matrix_value;
            matrix_value = matrix[row + 2][col];
            matrix[row + 2][col] = 1;
            row += 2;
            matrix[row][col] =1;
            check(matrix);
        }

        if (y == col && x == row+1 && matrix[x][y]!=1 && matrix[x][y]!=2) {

            setBounds(y * 100, x * 100, 100, 100);
            matrix[row][col] = matrix_value;
            matrix_value = matrix[row + 1][col];
            matrix[row + 1][col] = 1;
            row += 1;
            matrix[row][col] =1;
            check(matrix);
        }

        if (y == col && x == row-2 && matrix[x][y]!=1 && matrix[x][y]!=2) {

            setBounds(y * 100, x * 100, 100, 100);
            matrix[row][col] = matrix_value;
            matrix_value = matrix[row - 2][col];
            matrix[row - 2][col] = 1;
            row -= 2;
            matrix[row][col] =1;
            check(matrix);
        }

        if (y == col && x == row-1 && matrix[x][y]!=1 && matrix[x][y]!=2) {

            setBounds(y * 100, x * 100, 100, 100);
            matrix[row][col] = matrix_value;
            matrix_value = matrix[row - 1][col];
            matrix[row - 1][col] = 1;
            row -= 1;
            matrix[row][col] =1;
            check(matrix);
        }


        if (matrix[x][y] ==3) {
            moveBush(x,y,matrix);
        }
           System.out.println();
           for (int i = 0; i < matrix.length; i++) {
               System.out.println("");
               for (int j = 0; j < matrix[i].length; j++) {
                   System.out.print(matrix[i][j] + "   ");
               }
           }
    }

    public void check (int [] [] matrix){
        boolean race = this instanceof SuperRabbit;
        if (race) {
            this.setIcon(new ImageIcon("images/superrabbit.jpg"));
        }
        else this.setIcon(new ImageIcon("images/rabbit.png"));

        energy--;
        if (matrix_value==4) {
            energy+=2;
           matrix_value = 0;
        }

        else if (matrix_value==3) {
            if (race) {
                this.setIcon(new ImageIcon("images/superrabbit_hidden.jpg"));
            }
            else this.setIcon(new ImageIcon("images/rabbit_hidden.png"));

            matrix[row][col] = 9;
        }
       RabbitField.round=true;
    }

public void death(int [][] matrix) {
    setVisible(false);
    matrix[row][col] = matrix_value;
    rabbitNumber--;
}

    public  void moveBush(int x, int y, int [][] matrix) {

    }


    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatrix_value() {
        return matrix_value;
    }

    public void setMatrix_value(int matrix_value) {
        this.matrix_value = matrix_value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String toString() {
        return "<html>Nyúl<br/>kor: " + age + "<br/>energy: " + energy + "</html>";
    }
}


