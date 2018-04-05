import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class MemoryCard extends JButton {
    private MemoryCard card;
    private int col;
    private int row;
    private int id;
    private boolean show = false;
    static int cardPieces =0;
    static boolean freeze= false;

    public MemoryCard(int col, int row, MemoryCard [] [] matrix, MemoryCard [] currentCards, String url) {
        this.col = col;
        this.row = row;

        Timer timer = new Timer();

        matrix[col][row] = this;
        card = this;

        id = cardPieces/2;
        cardPieces++;

        this.setBounds(col*85,row*85,100,100);
        this.setVisible(true);

        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {

                if (!freeze) {
                card.setIcon(new ImageIcon(url + new Integer(id).toString() +".jpg"));
                }

                if (!show && !freeze) {
                    selecting(currentCards);
                }

                //System.out.println(currentCards[0]);
                //System.out.println(currentCards[1]);

                TimerTask task = new TimerTask() {
                    public void run() {

                        currentCards[0].setIcon(new ImageIcon(""));
                        currentCards[1].setIcon(new ImageIcon(""));

                        checking(currentCards);

                        freeze=false;
                    }
                };

                if (!freeze && currentCards[1] !=null) {
                    freeze = true;
                    timer.schedule(task, 2000);
                }
            }
        });
    }

    public void selecting(MemoryCard [] cardobj) {
        if (cardobj[0] == null) {
            cardobj[0] = card;
        }
        else if (cardobj[1] == null) {
            cardobj[1] = card;
        }
        show=true;
    }

    public void checking (MemoryCard [] cardobj) {
        if (cardobj[0] != null && cardobj[1] != null) {
            if (cardobj[0].id == cardobj[1].id) {
               disappear(cardobj);
            }

            if (cardobj[0]!=null) {
                cardobj[0].show=false;
            }

            if (cardobj[1]!=null) {
                cardobj[1].show=false;
            }

            cardobj[0] = null;
            cardobj[1] = null;
        }
    }

    public void disappear (MemoryCard [] cardobj) {
        cardobj[0].setVisible(false);
        cardobj[1].setVisible(false);
        cardobj[0] = null;
        cardobj[1] = null;
        cardPieces-=2;
    }

}
