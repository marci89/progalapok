import javax.rmi.CORBA.Util;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(read("2.txt"));
        writeToFile("./szia.txt", "hozzáfűzi");
       //write("szia.txt","szia iitt vok");

    }
// file beolvasás
    public  static String read(String file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {

            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }

        return sb.toString();
}




// file kiírás, létrehoz file-t is
public static void write (String file, String mit) {
    Writer writer = null;

    try {
        writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(file), "utf-8"));
        writer.write(mit);
        writer.flush();
    } catch (IOException ex) {
        // Report
    } finally {
        try {writer.close();} catch (Exception ex) {/*ignore*/}
    }
}


// file kiíratás, másképpen
    public static void writeToFile(String filename, String content) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename, true)); // true: append paraméter -> mindig hozzáfűz
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }








}
