public class Main {
    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTree(5);
        tree.display();

    }
}
class ChristmasTree {
    private int size;

    public ChristmasTree(int size) {
        this.size = size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 0; j < size - 1; j++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public void setSize(int newSize) {
        this.size = newSize;
    }
}


