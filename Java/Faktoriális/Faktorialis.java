public class Faktorialis {

    public static void main(String[] args) {

        System.out.println(factorialis(5));
    }

    public static int factorialis (int number) {
        int result = 1;

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                result = result * i;
            }
            System.out.print(number + "! = ");
            return result;
        } else {
            System.out.print("nem lehet negatív szám vagy ");
        }
        return 0;
    }
}

/*
output:
6! = 120

Process finished with exit code 0

 */
