public class Main {
    public static void main(String[] args) {

        String reset = "\u001B[0m";
        String green = "\u001B[32m";
        String brown = "\u001B[33m";
        
        System.out.println(green + "     *    " + reset);
        System.out.println(green + "    ***   " + reset);
        System.out.println(green + "   *****  " + reset);
        System.out.println(brown + "    | |   " + reset);
        for (int i = 0; i < 3; i++) {
            System.out.println("MERRY CHRISTMAS!");
        }
    }
}

