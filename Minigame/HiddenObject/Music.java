import javax.swing.*;
import sun.audio.*;
import java.awt.event.*;
import java.io.*;

    public class Music {

        private String url;

        public Music(String url) {
            this.url = url;
        }

        public  void music(){

            String filename = url;

            InputStream in = null;
            try {
                in = new FileInputStream(filename);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            try {
                AudioStream s = new AudioStream(in);
                AudioData MD;
                AudioPlayer.player.start(s);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }


        }






    }


