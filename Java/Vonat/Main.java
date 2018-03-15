import jarmu.Szemelyvonat;
import jarmu.Tehervonat;
import jarmu.Vonat;

public class Main {

// args elemei: teher Algyő Dunaújváros 280 70 olaj 2500 személy Szeged Békéscsaba 93 70 13 személy Párizs London 500 300 2
    public static void main(String[] args) {




            Vonat[] trains = new Vonat[3];
            int counter = 0;
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("személy")) {
                    Szemelyvonat vonat = new Szemelyvonat(args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]), Integer.parseInt(args[i + 4]), Integer.parseInt(args[i + 5]));
                    i += 5;
                    trains[counter] = vonat;
                    counter++;
                } else if (args[i].equals("teher")) {
                    Tehervonat teher = new Tehervonat(args[i + 1], args[i + 2], Integer.parseInt(args[i + 3]), Integer.parseInt(args[i + 4]), args[i + 5], Integer.parseInt(args[i + 6]));
                    trains[counter] = teher;
                    counter++;
                    i += 6;
                }
            }

            // min-max progtétel
        Vonat fastestTrain = trains[0];
        for (int i = 0; i < trains.length;i++){
            if (trains[i].leghamarabb() < fastestTrain.leghamarabb()){
                fastestTrain = trains[i];

            }
        }




        System.out.println(trains[0]);
        System.out.println(trains[1]);
        System.out.println(trains[2]);
        System.out.println("A leggyorsabb:");
        System.out.println(fastestTrain);
        System.out.println(fastestTrain.leghamarabb());










    }
}
