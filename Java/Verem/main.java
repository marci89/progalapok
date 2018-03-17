public class main {



    public static void main(String[] args) {
        Verem verem = new Verem(5);
        try {
            verem.push("1");
            verem.push("2");
            verem.push("3");
            verem.push("4");
            verem.push("5");
            System.out.println("verem eredeti állapota");
            System.out.println(verem);

            System.out.println("pop funkcióval: ");
            System.out.println(verem.pop());

            System.out.println("push -al az utolsó elemet felülírja: ");
            verem.push("6");
            System.out.println(verem.pop());
            System.out.println(verem.pop());
            System.out.println(verem.pop());
            System.out.println(" poppal visszább lépünk, így felülírjuk push-al ott: alma");
            verem.push("alma");

            System.out.println(verem);


            System.out.println("van benne kettes? ");

            System.out.println(verem.search("2"));
            System.out.println("alma utám még módosítjuk az elemet");
            verem.push("a");
            System.out.println(verem);
            System.out.println("vége");



        } catch (Kivetel err1) {
            err1.printStackTrace();

        } catch (Kivetel2 err2) {

            err2.printStackTrace();
        }

/*
output:

verem eredeti állapota
tomb=[1, 2, 3, 4, 5]}
pop funkcióval:
5
push -al az utolsó elemet felülírja:
6
4
3
 poppal visszább lépünk, így felülírjuk push-al ott: alma
tomb=[1, 2, alma, 4, 6]}
van benne kettes?
true
alma utám még módosítjuk az elemet
tomb=[1, 2, alma, a, 6]}
vége

Process finished with exit code 0
 */
    }
}
