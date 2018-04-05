import javax.swing.*;
import java.awt.*;


public class MemoryCardFrame extends JFrame {
    private int matrixRow;
    private int matrixCol;
    private String url;
    private MemoryCard [] currentCards = new MemoryCard [2];

    public MemoryCardFrame(int matrixRow, int matrixCol, String url) {

        this.matrixRow = matrixRow;
        this.matrixCol = matrixCol;

        JFrame frame = new JFrame();
        MemoryCard matrix [][] = new MemoryCard[matrixRow][matrixCol];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                frame.add(new MemoryCard(i,j,matrix, currentCards,url));
            }
        }

        mix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
              matrix[i][j].setBounds(j*105,i*105,100,100);
            }
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900, 800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.blue);
    }

    public void mix (MemoryCard [] [] array) {
        MemoryCard e;
        int a, aSwap;
        int b, bSwap;
        for (int i =0; i < 10000; i++) {
            a = (int) (Math.random() * matrixRow);
            b = (int) (Math.random() * matrixCol);

            aSwap = (int) (Math.random() * matrixRow);
            bSwap = (int) (Math.random() * matrixCol);

            e = array[a][b];
            array[a][b] = array[aSwap][bSwap];
            array[aSwap][bSwap] = e;
        }
    }
}
