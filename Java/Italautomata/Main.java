import Automata.UresAutomata;
import Automata.Italautomata;


// argsban: 25 true
public class Main {

    public static void informacio(Italautomata italautomata) {
        System.out.println("A készülékben " + italautomata.getBedobottPenz() +
         " pénz van és még " + italautomata.getPohar() + " alkalommal lehet használni");
    }

    public static void main(String[] args) {


        UresAutomata alma = new UresAutomata(23,3,false);
        UresAutomata alma2 = new UresAutomata(23,3,true);
        Italautomata kola = new Italautomata(3,true);
        //System.out.println(alma);
        //System.out.println(alma2);
        //kola.penztbedob(96);


        for (int i = 0; i < args.length; i++) {
            Italautomata fanta = new Italautomata(Integer.parseInt(args[i]),Boolean.parseBoolean(args[i + 1]));
            System.out.println(fanta.toString());
            fanta.penztbedob(100);
            informacio(fanta);
            i+=1;
        }



    }
}


