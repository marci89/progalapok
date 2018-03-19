import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;



public class Obj_img extends JLabel{
    private String name;
    private int position_x;
    private int position_y;
    private int size_x;
    private int site_y;
    private String url;
    static int piece;




    public Obj_img(int position_x, int position_y, int size_x, int site_y, String url) {

        this.position_x = position_x;
        this.position_y = position_y;
        this.size_x = size_x;
        this.site_y = site_y;
        this.url = url;

        this.setBounds(position_x,position_y,size_x,site_y);
        this.setVisible(true);
        this.setIcon(new  ImageIcon(url));
piece++;
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked (MouseEvent e) {

                setVisible(false);
                piece--;

            }
        });
    }



}
