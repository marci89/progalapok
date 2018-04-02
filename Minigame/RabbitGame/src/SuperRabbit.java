import javax.swing.*;

public class SuperRabbit extends Rabbit {

    public SuperRabbit(int[][] matrix, Rabbit[] rabbitArray, Rabbit[] selectedanimal) {
        super(matrix, rabbitArray, selectedanimal);
        energy = 3;
        this.setIcon(new ImageIcon("images/superrabbit.jpg"));

    }

    public  void moveBush(int x, int y, int [][] matrix) {
        setBounds(y * 100, x * 100, 100, 100);
        matrix[row][col] = matrix_value;
        matrix_value = matrix[x][y];
        matrix[x][y] = 9;
        row = x;
        col = y;
        matrix[row][col] = 1;
        check(matrix);

    }

    public String toString() {
        return "<html>Szuper Nyúl:<br/>kor: " + age + "<br/>energy: " + energy +
                "<br/>szuper képessége:<br/>Azonnal a bokorba ugrik</html>";
    }

}