import Kivetel.RosszMinoseg;

import java.io.*;

public class Main {


    public static void main(String[] args) throws RosszMinoseg {
        TejTermek [] tejtermek = new TejTermek[2];
        Gyumolcs [] gyumolcstermek = new Gyumolcs[1];
        String text="";

        //TejTermek tej = new TejTermek("milk", 134756836, 66633);
        //tej.joMeg();


        BufferedReader reader = null;
        StringBuilder result = new StringBuilder();
        int howmany;


        try {
            reader = new BufferedReader(new FileReader(new java.io.File("input.csv")));
            String line = null;
            int counter=0;
            int counter2=0;
            while ((line = reader.readLine()) != null) {

                String [] temp = line.split(";");
                if (temp[0].equals("T")) {
                    TejTermek tejecske = new  TejTermek(Long.parseLong(temp[1]),Long.parseLong(temp[2]),temp[1]);
                    tejtermek[counter] = tejecske;

                    counter++;
                }

                if (temp[0].equals("Gy")) {
                    Gyumolcs gyumi = new Gyumolcs(temp[1]);
                    gyumolcstermek[counter2] = gyumi;
                    counter2++;

                }



                //result.append(line).append("");
                //System.out.println(temp[0]);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }















        BufferedWriter writerGOOD = null;
        BufferedWriter writerBAD = null;



// fileba írás
        try {
            writerGOOD = new BufferedWriter(new FileWriter("mehet a polcra.csv"));
            writerBAD = new BufferedWriter(new FileWriter("kuka.csv"));

            for (int i = 0; i < tejtermek.length; i++) {
                String file = "";
                try {
                    if (tejtermek[i].joMeg()) {
                        writerGOOD.write(tejtermek[i].toString()+ "\n");
                    } else writerBAD.write(tejtermek[i].toString()+ "\n");
                } catch (RosszMinoseg e) {
                        e.printStackTrace();
                    writerBAD.write(tejtermek[i].toString()+ "\n");
                }
            }


            for (int i = 0; i < gyumolcstermek.length; i++) {
                String file = "";
                try {
                    if (gyumolcstermek[i].joMeg()) {
                        writerGOOD.write(gyumolcstermek[i].toString()+ "\n");
                    } else writerBAD.write(gyumolcstermek[i].toString()+ "\n");
                }  catch (RosszMinoseg e) {
                e.printStackTrace();
                    writerBAD.write(gyumolcstermek[i].toString()+ "\n");
                }
            }

            writerGOOD.flush();
            writerBAD.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writerGOOD.close();
                writerBAD.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }










        System.out.println(result);
        text=result.toString();
        text.split(" ");

for (int i =0; i < tejtermek.length; i++) {
    System.out.println(tejtermek[i]);
}
        System.out.println(gyumolcstermek[0]);









    }








}





        //System.out.println(readFile("input.csv"));








