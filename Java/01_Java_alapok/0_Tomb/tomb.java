public class tomb {
    public static void main(String [ ] args) {

        int [] [] tomb = {{1, 2, 3}, {4, 5, 6}};
        String [] [] [] tomb2 = {{{"a"}, {"b"}, {"c"}}, {{"d"}, {"e"}, {"f"}}};

        System.out.println("tömb egyik eleme: " + tomb[1][1]);
        System.out.println("mátrix elemei kiírtava.");
        for (int i = 0; i<tomb.length; i++) {
            System.out.println("");
            for (int j = 0; j<tomb[i].length; j++) {
              System.out.print(tomb[i][j]+" ");
            }
        }


/*
output:

tömb egyik eleme: 5
mátrix elemei kiírtava.

1 2 3
4 5 6
Process finished with exit code 0
 */


    }

}


