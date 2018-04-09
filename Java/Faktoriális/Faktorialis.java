public class Faktorialis {

    public static void main(String[] args) {

        System.out.println(factorialis(6));
    }

    public static int factorialis (int number) {
        int result = 1;
        for (int i = 1; i < number; i++) {
            result = result * i;
        }
        System.out.print(number + "! = ");
     return result;
    }
}

/*
output:
6! = 120

Process finished with exit code 0

 */
