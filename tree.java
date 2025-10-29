public class Main {
    public static void main(String[] args) {

        String reset = "\u001B[0m";
        String green = "\u001B[32m";
        String brown = "\u001B[33m";
        String red = "\u001B[31m";
        String yellow = "\u001B[93m";
        String blue = "\u001B[34m";
        
        System.out.println(yellow + "     *    " + reset);
        System.out.println(green + "     *    " + reset);
        System.out.println(green + "    ***   " + reset);
        System.out.println(green + "   *" + red + "°" + green + "*" + blue + "°" + green + "*  " + reset);

        char box = '▣'; 

        System.out.print(red + box + box + " " + reset);
        System.out.print(brown + "| |" + reset);
        System.out.print(blue + box  + reset);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("MERRY CHRISTMAS!");
        }
        
    }
}
